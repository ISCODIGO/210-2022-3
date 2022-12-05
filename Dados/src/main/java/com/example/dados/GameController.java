package com.example.dados;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {
    private Juego game;

    @FXML private Button buttonElegir;
    @FXML private ImageView imageView1;
    @FXML private ImageView imageView2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // esta funcion se llama cuando la aplicacion se inicia
        game = new Juego();
        game.lanzar();  // primer lanzamiento
        mostrarImagenes(game);
    }

    @FXML
    public void buttonLanzarClick() {
        game.lanzar();
        mostrarImagenes(game);
        System.out.println(game);
    }

    private void mostrarImagenes(Juego j) {
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
}