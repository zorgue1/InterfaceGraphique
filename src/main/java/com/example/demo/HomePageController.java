package com.example.demo;

import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.Objects;

public class HomePageController {

    HelloApplication helloApplication;

    private HomePageVue homePageVue;

    public HomePageController(HomePageVue homePageVue, HelloApplication helloApplication){
        this.helloApplication = helloApplication;
        this.homePageVue = homePageVue;
        homePageVue.getStylesheets().add(
                Objects.requireNonNull(
                        getClass()
                                .getResource("style.css")
                ).toExternalForm()
        );
        homePageVue.exitButton.setOnAction(this::exitGame);
        homePageVue.playButton.setOnAction(this::changeView);
    }

    public void exitGame(ActionEvent e)  {
            System.exit(0);
    }

    private void changeView(ActionEvent e) {

        helloApplication.showBureauD();
    }


}

