package com.example.demo;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class AnotherVue extends VBox {

    Label label = new Label("this is another view");

    Label labelBis = new Label("two labels!");

    Button button =  new Button("Drink me!");

    public AnotherVue(){
        this.getChildren().addAll(label, labelBis,button);
    }
}
