package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class Main1 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage Stage) {

        Label lbl = new Label("hello");
        Label lbl1 = new Label("hello");
        Label lbl2 = new Label("hello");
        Label lbl3 = new Label("hello");
        Label lbl4 = new Label("hello");
        Label lbl5 = new Label("hello");
        Label lbl6 = new Label("hello");

        HBox root = new HBox(10, lbl,lbl1,lbl2,lbl3,lbl4,lbl5,lbl6);
        Scene scene = new Scene(root, 500, 150);
        Stage.setScene(scene);
        Stage.setTitle("HBox in JavaFX");

        Stage.show();
    }
}