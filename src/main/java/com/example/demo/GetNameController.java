package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class GetNameController {

    @FXML
    public Button exitButton;

    @FXML
    public void actionPerformed(ActionEvent e) throws IOException {
        if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

}
