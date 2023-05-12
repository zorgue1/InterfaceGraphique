package com.example.demo;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class NameVue extends Pane {


    Label welcomeText = new Label("welcome to my office young wizard");

    TextField textField = new TextField("What is your wizard's name ?");

    Button nextButton = new Button("Next step");
    Button exitButton = new Button("exit");

    Button changeButton = new Button("Want to see some change?");


    public NameVue() {

        ImageView backgroundImageView = new ImageView(new Image("file:src/main/resources/com/example/demo/images/bureauD.jpg"));

        this.getChildren().add(backgroundImageView);

        this.getChildren().addAll(welcomeText, textField, nextButton, exitButton);


    }
    @Override
    public void layoutChildren() {
        super.layoutChildren();

        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        textField.setLayoutX(centerX - textField.getWidth() / 2);
        textField.setLayoutY(centerY - textField.getWidth() / 2);

        nextButton.setLayoutX(centerX - nextButton.getWidth() / 2);
        nextButton.setLayoutY(centerY - nextButton.getHeight() / 2);

        exitButton.setLayoutX(centerX - exitButton.getWidth() / 2);
        exitButton.setLayoutY(centerY + exitButton.getHeight() / 2);

        welcomeText.setLayoutX((getWidth() - welcomeText.getWidth()) / 2);
        welcomeText.setLayoutY(50); // Position en haut

        welcomeText.setStyle("-fx-text-fill: red;");
        welcomeText.setFont(new Font(40));

    }

}
