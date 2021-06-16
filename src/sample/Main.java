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
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.ComboBox;

public class Main extends Application {
    int clicks = 0;
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        ObservableList<String> langs = FXCollections.observableArrayList("Java", "JavaScript", "C#", "Python");
        ComboBox<String> langsComboBox = new ComboBox<String>(langs);
        langsComboBox.setValue("Java");
        Label lbl = new Label();
        FlowPane root = new FlowPane(10,10,langsComboBox, lbl);
        Scene scene = new Scene(root, 250,200);
        stage.setScene(scene);
        stage.setTitle("ComboBox in JavaFX");
        stage.show();

    }
}