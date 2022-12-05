package com.example.dados;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {
    private final int PUNTUACION_MAXIMA = 150;  // Si alcanza este valor gana
    private Juego game;
    private int valorPrevio;
    private boolean primerCero;
    private int puntos;

    @FXML private Button buttonElegir;
    @FXML private Label labelValor;
    @FXML private Label labelPuntos;
    @FXML private Label labelGanancia;
    @FXML private ImageView imageView1;
    @FXML private ImageView imageView2;
    @FXML private RadioButton radioMenor;
    @FXML private RadioButton radioIgual;
    @FXML private RadioButton radioMayor;
    private final ToggleGroup toggleGroup = new ToggleGroup();
    private Timeline timeline;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // esta funcion se llama cuando la aplicacion se inicia
        radioMenor.setToggleGroup(toggleGroup);
        radioIgual.setToggleGroup(toggleGroup);
        radioMayor.setToggleGroup(toggleGroup);
        radioIgual.setSelected(true);
        game = new Juego();
        primerCero = false;  // esto indica que ya inicio la primer jugada, no puede existir otro cero.
        puntos = 0;

        configAnimationHideText();
        jugar();  // primer lanzamiento
        valorPrevio = game.getValor();
    }

    @FXML
    public void buttonLanzarClick() {
        jugar();
        setPuntos();
        finish();
    }

    private void jugar() {
        game.lanzar();

        int valor = game.getValor();
        showImages(game);
        labelValor.setText(String.valueOf(valor));

        // para evitar un caso nulo se omiten los valores extremos
        if (valor == 2) {
            radioMenor.setDisable(true);
            radioIgual.setSelected(true);
        } else if (valor == 12) {
            radioMayor.setDisable(true);
            radioIgual.setSelected(true);
        } else {
            radioMenor.setDisable(false);
            radioMayor.setDisable(false);
        }
    }

    private void showImages(Juego j) {
        String[] imagenes = j.getImagenes();
        try {
            URI uri1 = GameApp.class.getResource(imagenes[0]).toURI();
            URI uri2 = GameApp.class.getResource(imagenes[1]).toURI();
            imageView1.setImage(new Image(uri1.toString()));
            imageView2.setImage(new Image(uri2.toString()));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    private void setPuntos() {
        /*
        Se me ocurre emplear un porcentaje en base a posibilidades. No es lo mismo adivinar con un 2 que el siguiente
        es menor a que el siguiente es menor teniendo un 12.
        Si se elige igual vale 100.
        Si se elige menor o mayor mientras mayor sea el riesgo mayor sera la puntuacion.

        Por ejemplo: si el valor actual es 10. Y elige que el siguiente es MENOR el puntaje a ganar es 12 pero si elige
        MAYOR gana 55.

        |----|----|----|----|----|----|----|----|----x----|----|
        1    2    3    4    5    6    7    8    9    10   11   12
         */

        int ganancia = 0;
        int valorActual = game.getValor();

        if (radioIgual.isSelected() && valorPrevio == valorActual) {
            ganancia = 110;
        } else if (radioMenor.isSelected() && valorPrevio > valorActual) {
            ganancia = 110 / (valorPrevio - 1);
        } else if (radioMayor.isSelected() && valorPrevio < valorActual) {
            ganancia = 110 / (12 - valorPrevio);
        } else {
            ganancia = -10;
        }
        this.puntos += ganancia;

        // omitir valores negativos (cuestion decorativa, nada mas)
        if (this.puntos < 0) {
            this.puntos = 0;
        }

        labelPuntos.setText(String.valueOf(this.puntos));

        // determinar la ganancia
        if (ganancia > 0) {
            labelGanancia.setTextFill(Color.web("1aa220"));  // otra forma de cambiar el color de la fuente
            labelGanancia.setText("+" + ganancia);
        } else if (ganancia == 0) {
            labelGanancia.setTextFill(Color.web("000000"));
            labelGanancia.setText("");
        } else {
            labelGanancia.setTextFill(Color.web("ff0000"));
            labelGanancia.setText(String.valueOf(ganancia));
        }
        valorPrevio = valorActual;
        timeline.play();  // ejecutar la animacion para ocultar el texto
    }

    private void finish() {
        // Esta funcion al cumplirse cualquier condicion cierra la aplicacion
        Alert alert;
        if (!primerCero && puntos == 0) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Perdiste!");
            alert.setHeaderText("Tienes cero. El juego ha terminado");
            alert.showAndWait();
            Platform.exit();
        } else if (puntos >= PUNTUACION_MAXIMA) {
            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ganaste!!!");
            alert.setHeaderText("Lograste la puntuacion maxima");
            alert.showAndWait();
            Platform.exit();
        }
    }

    private void configAnimationHideText() {
        this.timeline = new Timeline(
                new KeyFrame(
                        Duration.millis(600),
                        e -> labelGanancia.setText("  ")  // deje 3 espacios para que no se vea muy movido el cambio
                )
        );
        this.timeline.setCycleCount(1);  // solo se ejecuta una vez la animacion
    }
}