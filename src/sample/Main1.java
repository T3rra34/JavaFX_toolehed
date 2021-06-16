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
import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;

public class Main1 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Button okbtn = new Button("OK");
        Button cancelbtn = new Button("Cancel");
        Label lbl = new Label("Select");

        VBox vbox = new VBox(15);

        VBox.setVgrow(okbtn, Priority.ALWAYS);
        okbtn.setMaxHeight(Double.MAX_VALUE);
        okbtn.setMaxWidth(100);

        VBox.setVgrow(cancelbtn, Priority.ALWAYS);
        cancelbtn.setMaxHeight(Double.MAX_VALUE);
        cancelbtn.setMaxWidth(100);

        vbox.getChildren().addAll(lbl, okbtn, cancelbtn);

        Scene scene = new Scene(vbox, 300,150);
        stage.setScene(scene);

        stage.setTitle("VBox in JavaFX");

        stage.show();
    }
}