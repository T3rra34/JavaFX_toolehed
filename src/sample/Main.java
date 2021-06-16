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
import javafx.scene.control.ScrollPane;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TreeView;
import javafx.scene.control.TreeItem;

public class Main extends Application {
    int clicks = 0;
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        Label lbl = new Label("Label");
        lbl.setTooltip(new Tooltip("This is a label"));

        Button btn = new Button("Click");
        btn.setTooltip(new Tooltip("Click the button \nto start an action"));
        FlowPane root = new FlowPane(10,10,btn,lbl);
        Scene scene = new Scene(root,300,250);
        stage.setScene(scene);
        stage.setTitle("Tooltip in JavaFX");
        stage.show();

    }
}