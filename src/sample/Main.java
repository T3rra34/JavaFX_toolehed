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
import java.util.concurrent.Flow;

public class Main extends Application {
    int clicks = 0;
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        Label headerlbl = new Label("Scrollpane");
        Label textlbl = new Label("Lorem dmwaidmsimdiwmdiamwdim \n" +
                "Industry. odwmaodmosamwodmaomdwomadomawdowmaodmao \n" +
                "text ever dwoa,dowa,domawdomawomdboawmdobawod...");
        ScrollPane scrollPane = new ScrollPane(textlbl);
        scrollPane.setPrefViewportHeight(250);
        scrollPane.setPrefViewportWidth(200);

        FlowPane root = new FlowPane(Orientation.VERTICAL,10,10,headerlbl,scrollPane);
        Scene scene = new Scene(root, 300, 250);

        stage.setScene(scene);
        stage.setTitle("Hello JavaFX");
        stage.show();

    }
}