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
import javafx.scene.control.ChoiceBox;

public class Main extends Application {
    int clicks = 0;
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        ObservableList<String> langs = FXCollections.observableArrayList("Java", "JavaScript", "C#", "Python");
        ChoiceBox<String> langsChoiceBox = new ChoiceBox<String>(langs);
        langsChoiceBox.setValue("Java");
        Label lbl = new Label();
        langsChoiceBox.setOnAction(event -> lbl.setText(langsChoiceBox.getValue()));
        FlowPane root = new FlowPane(10,10,langsChoiceBox,lbl);
        Scene scene = new Scene(root,300,250);
        stage.setScene(scene);
        stage.setTitle("ChoiceBox in JavaFX");
        stage.show();

    }
}