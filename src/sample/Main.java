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
        TreeItem<String> rootTreenode = new TreeItem<String>("Languages");

        TreeItem<String> germanics = new TreeItem<String>("Germanic");
        germanics.getChildren().add(new TreeItem<String>("German"));
        germanics.getChildren().add(new TreeItem<String>("English"));

        TreeItem<String> romans = new TreeItem<String>("Roman");
        romans.getChildren().add(new TreeItem<String>("French"));
        germanics.getChildren().add(new TreeItem<String>("Spanish"));
        romans.getChildren().add(new TreeItem<String>("Italians"));

        rootTreenode.getChildren().add(germanics);
        rootTreenode.getChildren().add(romans);
        TreeItem<String> langsTreeView = new TreeView<String>(rootTreenode);
        langsTreeView.setPreftSize(150,200);
        FlowPane root = new FlowPane(10,10, langsTreeView);

        Scene scene = new Scene(root,300,250);
        stage.setScene(scene);
        stage.setTitle("TreeView in JavaFX");
        stage.show();

    }
}