package sample;

import javafx.application.Application;
import javafx.scene.control.CheckBox;
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

public class Main extends Application {
    int clicks = 0;
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        CheckBox java = new CheckBox("Java");
        java.setSelected(true);

        CheckBox javaScript = new CheckBox("JavaScript");
        javaScript.setAllowIndeterminate(true);

        CheckBox csharp = new CheckBox("C#");
        csharp.setAllowIndeterminate(true);
        csharp.setIndeterminate(true);

        FlowPane root = new FlowPane(Orientation.VERTICAL,0,10);
        root.getChildren().addAll(java,javaScript,csharp);
        root.setPadding(new Insets(10));
        Scene scene = new Scene(root, 250, 200);
        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();
    }
}