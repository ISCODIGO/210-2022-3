package com.example.dados;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    private Juego game;

    @FXML private Button buttonElegir;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // esta funcion se llama cuando la aplicacion se inicia
        game = new Juego();
        game.lanzar();  // primer lanzamiento

    }

    @FXML
    public void buttonLanzarClick() {
        game.lanzar();
        System.out.println(game);
    }

    private void mostrarImagenes() {
        String[] imagenes = game.getImagenes();
    }
}