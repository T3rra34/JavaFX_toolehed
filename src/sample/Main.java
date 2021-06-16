package sample;

import javafx.application.Application;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
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
        ToggleButton lightbtn = new ToggleButton("Light");
        Label statelbl = new Label();
        lightbtn.setOnAction(actionEvent -> {
            if (lightbtn.isSelected()) {
                statelbl.setText("Light on!");
            } else {
                statelbl.setText("Lights off..");
            }
            });

            FlowPane root = new FlowPane(10,10 );
            root.getChildren().addAll(lightbtn,statelbl);
            root.setPadding(new Insets(10));
            Scene scene = new Scene(root, 250, 200);
            stage.setScene(scene);
            stage.setTitle("Hello JavaFX");
            stage.show();

    }
}