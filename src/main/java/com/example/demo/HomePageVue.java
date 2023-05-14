package com.example.demo;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class HomePageVue extends Pane {


    Label welcomeText = new Label("welcome to HARRY'S RPG");

    Button exitButton = new Button("exit");

    Button playButton = new Button("Play");



    public HomePageVue() {

        ImageView backgroundImageView = new ImageView(new Image("file:src/main/resources/com/example/demo/images/FONDDEBASE.jpg"));

        this.getChildren().add(backgroundImageView);

        this.getChildren().addAll(welcomeText,playButton, exitButton);

    }


    @Override
    public void layoutChildren() {
        super.layoutChildren();

        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        playButton.setLayoutX(centerX - playButton.getWidth() / 2);
        playButton.setLayoutY(centerY - playButton.getHeight() / 2);

        exitButton.setLayoutX(centerX - exitButton.getWidth() / 2);
        exitButton.setLayoutY(centerY + exitButton.getHeight());

        welcomeText.setLayoutX((getWidth() - welcomeText.getWidth()) / 2);
        welcomeText.setLayoutY(50); // Position en haut

        welcomeText.setStyle("-fx-text-fill: red;");
        welcomeText.setFont(new Font(20));

        exitButton.setStyle("-fx-text-fill: black;");
        exitButton.setFont(new Font(20));
        playButton.setStyle("-fx-text-fill: black;");
        playButton.setFont(new Font(20));


    }


}

