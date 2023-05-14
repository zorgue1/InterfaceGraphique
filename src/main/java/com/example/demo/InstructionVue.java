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

public class InstructionVue extends Pane{

    Label welcomeText = new Label ();
    Button exitButton = new Button("exit");
    Button understandButton = new Button("Understand !");
    VBox bottomBox = new VBox();

    public InstructionVue() {

        ImageView backgroundImageView = new ImageView(new Image("file:src/main/resources/com/example/demo/images/fumée.jpg"));

        backgroundImageView.setFitWidth(1366);
        backgroundImageView.setFitHeight(768);

        this.getChildren().add(backgroundImageView);

        bottomBox.getChildren().addAll(welcomeText);
        bottomBox.setSpacing(20);
        bottomBox.setPadding(new Insets(0, 0, 50, 0)); // ajustez les marges selon vos besoins
        bottomBox.setStyle("-fx-background-color: white;"); // définir la couleur d'arrière-plan du VBox

        this.getChildren().addAll(understandButton,exitButton, bottomBox);
    }

    @Override
    public void layoutChildren() {
        super.layoutChildren();

        double centerX = getWidth() / 2;
        double centerY = getHeight() / 2;

        understandButton.setLayoutX(centerX - understandButton.getWidth() / 2);
        understandButton.setLayoutY(centerY - understandButton.getHeight() / 2);

        exitButton.setLayoutX(centerX - exitButton.getWidth() / 2);
        exitButton.setLayoutY(centerY + exitButton.getHeight());

        exitButton.setStyle("-fx-text-fill: black;");
        exitButton.setFont(new Font(20));
        understandButton.setStyle("-fx-text-fill: black;");
        understandButton.setFont(new Font(20));

        welcomeText.setStyle("-fx-text-fill: red;");
        welcomeText.setFont(new Font(15));

        bottomBox.setLayoutX(centerX - bottomBox.getWidth() / 2);
        bottomBox.setLayoutY(getHeight() - bottomBox.getHeight());
    }
}
