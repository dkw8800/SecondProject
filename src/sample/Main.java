package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();

        Label label4 = new Label("This is the fourth scene");
        Button button4 = new Button("Go to scene 1");
        button4.setOnAction(event -> primaryStage.setScene(scene1));
        VBox layout4 = new VBox(20);
        layout4.getChildren().addAll(label4, button4);
        scene4= new Scene(layout4,1200,800);
        layout4.setId("s4");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
