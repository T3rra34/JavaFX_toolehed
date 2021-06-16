package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage Stage) throws Exception {

        Group root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene(root);
        Stage.setScene(scene);
        Stage.setTitle("Hello JavaFX");
        Stage.setWidth(250);
        Stage.setHeight(250);
        Stage.show();



        Button btn = new Button();
        btn.setText("Click");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                btn.setText("You've clicked!");
                

            }
        });
        }
    }