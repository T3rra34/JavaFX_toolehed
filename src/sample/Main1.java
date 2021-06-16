package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import java.util.Stack;

public class Main1 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Label headerlbl = new Label("Press the login button");
        StackPane.setAlignment(headerlbl, Pos.TOP_CENTER);
        Label statuslbl = new Label("Start screen");
        StackPane.setAlignment(statuslbl, Pos.BOTTOM_CENTER);
        Button loginbtn = new Button("Login");

        StackPane root = new StackPane(headerlbl,statuslbl,loginbtn);

        Scene scene = new Scene(root , 300 ,150);
        stage.setScene(scene);

        stage.setTitle("Stackpane in JavaFX");

        stage.show();
    }
}