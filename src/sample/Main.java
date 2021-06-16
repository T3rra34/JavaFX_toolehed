package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage Stage) {

        Group root = new Group();
        Scene scene = new Scene(root);
        Stage.setScene(scene);
        Stage.setTitle("Hello JavaFX");
        Stage.setWidth(250);
        Stage.setHeight(250);
        Stage.show();
    }
}