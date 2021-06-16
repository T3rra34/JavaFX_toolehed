package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import java.util.concurrent.Flow;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        HBox hbox = new HBox();
        Button btn1 = new Button("Hello");
        VBox vbox = new VBox();

        VBox.setVgrow(btn1, Priority.ALWAYS);
        btn1.setMaxWidth(Double.MAX_VALUE);
        vbox.getChildren().addAll(btn1);

        Scene scene = new Scene(hbox, 300 , 150);
        stage.setScene(scene);

        stage.setTitle("hbox in JavaFX");
        stage.show();
    }
}