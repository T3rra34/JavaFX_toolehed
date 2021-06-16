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
        Label lbl = new Label();
        TextField textField = new TextField();
        textField.setPrefColumnCount(11);
        Button btn = new Button("Click");
        btn.setOnAction(event -> lbl.setText("input: " + textField.getText()));
        FlowPane root = new FlowPane(Orientation.VERTICAL, 10 , 10, textField,btn,lbl);
        Scene scene = new Scene(root, 250,200);
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();

    }
}