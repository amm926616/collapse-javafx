package com.amm.firstapp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        Image icon = new Image("img.png");
        stage.getIcons().add(icon);

        stage.setWidth(600);
        stage.setHeight(600);
        stage.setTitle("Collapse - A Board Game clone from 2 player games");

        stage.setScene(scene);
        stage.show();
    }
}