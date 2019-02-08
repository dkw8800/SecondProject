package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
public static int bottlelvl;
public static String[] bottlestats = new String[6];


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Message In A Bottle");
        primaryStage.setScene(new Scene(root, 1200, 800));
        DialogPane bottlesummary = (DialogPane) root.lookup("bottlesum");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public static void openBottle()
    {
        if(bottlestats[bottlelvl-1].equals("closed"))
        {
            DialoG.setHeaderText("This bottle has been sent off.");
        }
        //bottle image opened
        //bottle window opened, side by side - message writer and message rules paper
    }

    public static void changeBottle()
    {
        bottlestats[bottlelvl - 1] = "closed";
        bottlelvl++;
    }
}
