package com.example.relojgui;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML private Label labelReloj;
    @FXML private TextField textHoras;
    @FXML private Slider sliderMinutos;
    @FXML private Label labelMinutos;

    private Reloj reloj;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sliderMinutos.valueProperty().addListener(
                // lambda
                (observable, oldValue, newValue) -> labelMinutos.setText(
                        String.valueOf(newValue.intValue())
                )
        );
    }

    @FXML public void buttonElegirClick() {
        int horas = Integer.parseInt(textHoras.getText());
        int minutos = (int) sliderMinutos.getValue();
        int segundos = 0;
        reloj = new Reloj(horas, minutos, segundos);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}