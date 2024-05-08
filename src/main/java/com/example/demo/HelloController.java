package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("ok je l'ai fait");
    }

    public void onClickButtonClick() {
        welcomeText.setText("Trust in Good");
    }

}