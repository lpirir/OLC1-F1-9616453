package com.luispirir;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App extends Application
{    

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));

        stage.setTitle("Primer Proyecto");
        stage.setScene(new Scene(root));
        stage.show();
        /* scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show(); */
    }

    /* static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    } */

    public static void main( String[] args )
    {
        launch(args);
    }
}
