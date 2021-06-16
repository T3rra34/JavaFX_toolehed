package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.FlowPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;

import java.util.concurrent.Flow;

public class Main extends Application {
    int clicks = 0;
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        Label selectedlbl = new Label();

        RadioButton javabtn = new RadioButton("Java");
        RadioButton jsbtn = new RadioButton("JavaScript");
        RadioButton csharpbtn = new RadioButton("C#");

        ToggleGroup group = new ToggleGroup();
        javabtn.setToggleGroup(group);
        jsbtn.setToggleGroup(group);
        csharpbtn.setToggleGroup(group);

        javabtn.setOnAction(event -> selectedlbl.setText("Selected: Java"));
        jsbtn.setOnAction(event -> selectedlbl.setText("Selected: JavaScript"));
        csharpbtn.setOnAction(event -> selectedlbl.setText("Selected: C#"));

        FlowPane root = new FlowPane(Orientation.VERTICAL, 20,10);
        root.getChildren().addAll(javabtn,jsbtn,csharpbtn);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 250,200);
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();

    }
}