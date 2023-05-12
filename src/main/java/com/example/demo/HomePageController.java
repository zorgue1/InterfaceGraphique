package com.example.demo;

import com.example.demo.model.Game;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.Objects;

public class HomePageController {

    HelloApplication helloApplication;

    Game game;

    private HomePageVue homePageVue;

    public HomePageController(HomePageVue homePageVue, Game game, HelloApplication helloApplication){
        this.helloApplication = helloApplication;
        this.homePageVue = homePageVue;
        this.game = game;
        homePageVue.getStylesheets().add(
                Objects.requireNonNull(
                        getClass()
                                .getResource("style.css")
                ).toExternalForm()
        );
        homePageVue.exitButton.setOnAction(this::exitGame);
        homePageVue.playButton.setOnAction(this::changeView);
        homePageVue.welcomeText.setText(this.game.getStory().instruction());
    }

    public void exitGame(ActionEvent e)  {
            System.exit(0);
    }

    private void changeView(ActionEvent e) {

        helloApplication.showBureauD();
    }


}

