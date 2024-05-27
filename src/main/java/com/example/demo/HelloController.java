package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;
import javafx.collections.FXCollections;

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
    @FXML
    private ComboBox<String> roleComboBox;

    public void onDropRole() {
        roleComboBox.setItems(FXCollections.observableArrayList("Admin", "Player"));
    }

    public void onTextChange() {

    }

    public void onUserNameClick() {

    }

}