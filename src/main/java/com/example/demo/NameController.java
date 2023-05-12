package com.example.demo;

import javafx.event.ActionEvent;

import java.util.Objects;

public class NameController {

    HelloApplication helloApplication;

    private NameVue nameVue;

    public NameController(NameVue nameVue, HelloApplication helloApplication){
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
    }


    private void onWelcomeAction(ActionEvent e) {
        nameVue.welcomeText.setText(String.format("Greetings %s! Welcome to Hogwarts", nameVue.textField.getText()));
    }

    private void changeView(ActionEvent e) {

        helloApplication.showAnotherScene();
        helloApplication.showCombat1();
    }

    public void exitGame(ActionEvent e)  {
        System.exit(0);
    }

}
