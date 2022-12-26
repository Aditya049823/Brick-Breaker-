package com.example.brickbreaker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    static Stage globalstage;
    //start will load the startpage
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("start page.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        globalstage=stage;
        stage.setTitle("Brick-Breaker Mania");
        stage.setScene(scene); //it will load the scene as specified in game-screen file.
        stage.show();
    }
    //below function will load the gamescreen
    public void Onstartbuttonclick() throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        globalstage.setScene(scene);
        globalstage.setTitle("Let's Play!!");
        globalstage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}