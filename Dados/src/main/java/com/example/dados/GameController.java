package com.example.dados;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {
    private Juego game;
    private int valorPrevio;

    @FXML private Button buttonElegir;
    @FXML private Label labelValor;
    @FXML private Label labelPuntos;
    @FXML private ImageView imageView1;
    @FXML private ImageView imageView2;
    @FXML private RadioButton radioMenor;
    @FXML private RadioButton radioIgual;
    @FXML private RadioButton radioMayor;
    private final ToggleGroup toggleGroup = new ToggleGroup();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // esta funcion se llama cuando la aplicacion se inicia
        radioMenor.setToggleGroup(toggleGroup);
        radioIgual.setToggleGroup(toggleGroup);
        radioMayor.setToggleGroup(toggleGroup);
        radioIgual.setSelected(true);
        game = new Juego();

        jugar();  // primer lanzamiento

        valorPrevio = game.getValor();
    }

    @FXML
    public void buttonLanzarClick() {
        jugar();
        setPuntos();
    }

    private void jugar() {
        game.lanzar();

        int valor = game.getValor();
        showImages(game);
        labelValor.setText(String.valueOf(valor));

        if (valor == 1) {
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
        Si se elige menor o mayor

        |----|----|----|----|----|----|----|----|----x----|----|
        1    2    3    4    5    6    7    8    9    10   11   12
         */

        int valorActual = game.getValor();
        int puntos = Integer.parseInt(labelPuntos.getText());

        if (radioIgual.isSelected() && valorPrevio == valorActual) {
            puntos += 110;
            System.out.println("Acierto igual: 110");
        } else if (radioMenor.isSelected() && valorPrevio > valorActual) {
            puntos += 110 / (valorPrevio - 1);
            System.out.println("Acierto menor: " + (100 / (valorPrevio - 1)));
        } else if (radioMayor.isSelected() && valorPrevio < valorActual) {
            puntos += 110 / (12 - valorPrevio);
            System.out.println("Acierto mayor: " + (110 / (12 - valorPrevio)));
        }
        labelPuntos.setText(String.valueOf(puntos));
        valorPrevio = valorActual;
    }
}