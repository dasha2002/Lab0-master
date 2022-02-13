package com.example.lab1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome!");
    }

    @FXML
    protected void onButHiButtonClick() {welcomeText.setText("Hehe");}

    @FXML
    private Label Lab2;

    @FXML
    private void initialize() {
        Lab2.setText("New");
    }


}