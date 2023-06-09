package com.example.demo;

import com.example.demo.model.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class HelloApplication extends Application {
    Stage stage;
    Game game;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage=stage;
        this.game = new Game();
        showStartScene();

    }


    public void showStartScene() {
        HomePageVue homePageVue = new HomePageVue();
        HomePageController homePageController = new HomePageController(homePageVue,game,this);
        Scene scene = new Scene(homePageVue, 1366, 768);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public void showInstructionScene() {
        InstructionVue instructionVue = new InstructionVue();
        InstructionController instructionController = new InstructionController(instructionVue,game,this);
        Scene scene = new Scene(instructionVue, 1366, 768);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    public void showCombat1() {
        Combat1Vue combat1Vue = new Combat1Vue();
        Combat1Controller combat1Controller = new Combat1Controller(combat1Vue,game,this);
        Scene scene = new Scene(combat1Vue, 1366, 768);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public void showCombat2() {
        Combat2Vue combat2Vue = new Combat2Vue();
        Combat2Controller combat2Controller = new Combat2Controller(combat2Vue,game,this);
        Scene scene = new Scene(combat2Vue, 1366, 768);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    public void showBureauD(){
        NameVue nameVue =  new NameVue();
        NameController nameController = new NameController(nameVue,game, this);
        Scene scene = new Scene(nameVue, 1366, 768);
        stage.setTitle("Wizard's name");
        stage.setScene(scene);
        stage.show();
    }

    public void showAnotherScene(){
        AnotherVue anotherVue =  new AnotherVue();
        AnotherController anotherController = new AnotherController(anotherVue);
        Scene scene = new Scene(anotherVue, 1366, 768);
        stage.setTitle("World!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}