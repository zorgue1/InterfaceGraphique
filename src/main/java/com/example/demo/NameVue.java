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

public class NameVue extends Pane {


    Label welcomeText = new Label();
    Label wizard = new Label();

    TextField textField = new TextField("What is your wizard's name ?");

    Button okButton = new Button ("     OK     ");
    Button nextButton = new Button("Next step");
    Button exitButton = new Button("exit");

    Button changeButton = new Button("Want to see some change?");

    VBox bottomBox = new VBox();


    public NameVue() {

        ImageView backgroundImageView = new ImageView(new Image("file:src/main/resources/com/example/demo/images/bureauD.jpg"));

        this.getChildren().add(backgroundImageView);

        bottomBox.getChildren().addAll(welcomeText, wizard);
        bottomBox.setSpacing(30);
        bottomBox.setPadding(new Insets(0, 0, 50, 0)); // ajustez les marges selon vos besoins
        bottomBox.setStyle("-fx-background-color: white;"); // définir la couleur d'arrière-plan du VBox

        this.getChildren().addAll(textField, nextButton,okButton, exitButton,bottomBox);


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

        okButton.setLayoutX(centerX - okButton.getWidth() / 2);
        okButton.setLayoutY(centerY - okButton.getHeight() / 2);


        welcomeText.setLayoutX((getWidth() - welcomeText.getWidth()) / 2);
        welcomeText.setLayoutY(50); // Position en haut

        welcomeText.setStyle("-fx-text-fill: black;");
        welcomeText.setFont(new Font(15));
        wizard.setStyle("-fx-text-fill: red;");
        wizard.setFont(new Font(15));


        bottomBox.setLayoutX(centerX - bottomBox.getWidth() / 2);


    }

}
