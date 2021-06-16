package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.geometry.Pos;

public class Main1 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Button topbtn = new Button("Top");
        AnchorPane.setTopAnchor(topbtn, 10.0);
        AnchorPane.setLeftAnchor(topbtn, 60.0);
        AnchorPane.setRightAnchor(topbtn, 60.0);

        Button botbtn = new Button("Bot");
        AnchorPane.setTopAnchor(botbtn, 10.0);
        AnchorPane.setLeftAnchor(botbtn, 60.0);
        AnchorPane.setRightAnchor(botbtn, 60.0);

        Button leftbtn = new Button("left");
        AnchorPane.setTopAnchor(leftbtn, 10.0);
        AnchorPane.setLeftAnchor(leftbtn, 60.0);
        AnchorPane.setRightAnchor(leftbtn, 60.0);

        Button rightbtn = new Button("Right");
        AnchorPane.setTopAnchor(rightbtn, 10.0);
        AnchorPane.setLeftAnchor(rightbtn, 60.0);
        AnchorPane.setRightAnchor(rightbtn, 60.0);

        AnchorPane root = new AnchorPane(topbtn,rightbtn,botbtn,leftbtn);

        Scene scene = new Scene(root , 300 ,150);
        stage.setScene(scene);

        stage.setTitle("AnchorPane in JavaFX");

        stage.show();
    }
}