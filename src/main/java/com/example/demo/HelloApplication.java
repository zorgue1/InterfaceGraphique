package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Stage stage;



    @Override
    public void start(Stage stage) throws IOException {
        this.stage=stage;
        showStartScene();

    }


    public void showStartScene() {
        HomePageVue homePageVue = new HomePageVue();
        HomePageController homePageController = new HomePageController(homePageVue,this);
        Scene scene = new Scene(homePageVue, 1366, 768);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public void showBureauD(){
        NameVue nameVue =  new NameVue();
        NameController nameController = new NameController(nameVue, this);
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