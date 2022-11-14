package com.example.tictactoe;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GameController {
    @FXML
    private Button button00;

    @FXML
    protected void onHelloButtonClick() {
        button00.setText("Welcome to JavaFX Application!");
    }
}