package com.example.relojgui;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    static int i = 0;
    @FXML
    private Label welcomeText;
    @FXML
    private Label labelReloj;
    Reloj reloj = new Reloj();

    // Animacion
    Timeline timeline = new Timeline(
            new KeyFrame(
                    Duration.seconds(1.0),
                    e -> {
                        reloj.incrementar1Seg();
                        labelReloj.setText(String.valueOf(reloj));
                    }
            )

    );

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}