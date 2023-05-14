package com.example.demo;

import com.example.demo.controler.Main;
import com.example.demo.model.Game;
import javafx.event.ActionEvent;

import java.util.Objects;

public class NameController {

    HelloApplication helloApplication;

    Game game;

    Main main;

    private NameVue nameVue;

    public NameController(NameVue nameVue,Game game , HelloApplication helloApplication){
        this.helloApplication = helloApplication;
        this.nameVue = nameVue;
        nameVue.getStylesheets().add(
            Objects.requireNonNull(
                    getClass()
                            .getResource("style.css")
            ).toExternalForm()
        );
        nameVue.nextButton.setOnAction(this::changeView);
        nameVue.changeButton.setOnAction(this::changeView);
        nameVue.exitButton.setOnAction(this::exitGame);
        nameVue.welcomeText.setText(game.getStory().beginning() );
        nameVue.okButton.setOnAction(this::onWelcomeAction);


    }


    private void onWelcomeAction(ActionEvent e) {

        nameVue.getChildren().remove(nameVue.okButton);

        nameVue.wizard.setText(String.format("Greetings %s! Welcome to Hogwarts. You are going to create your wizard now, Click on *next step* button ", nameVue.textField.getText()));
    }

    private void changeView(ActionEvent e) {

        helloApplication.showCombat1();
    }

    public void exitGame(ActionEvent e)  {
        System.exit(0);
    }


}
