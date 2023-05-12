package com.example.demo;

import javafx.event.ActionEvent;

public class AnotherController {

    AnotherVue anotherVue;

    public AnotherController(AnotherVue anotherVue){
        this.anotherVue= anotherVue;
        this.anotherVue.button.setOnAction(this::buttonOnAction);
    }


    public void buttonOnAction(ActionEvent e){
        anotherVue.label.setText("You're a wizard, Harry !");
        anotherVue.labelBis.setText("Welcome to Hogwarts");
    }
}
