package com.example.tictactoe;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GameController {
    @FXML
    private Button button00;
    @FXML
    private Button button01;
    @FXML
    private Button button02;
    @FXML
    private Button button10;
    @FXML
    private Button button11;
    @FXML
    private Button button12;
    @FXML
    private Button button20;
    @FXML
    private Button button21;
    @FXML
    private Button button22;
    @FXML
    private Label labelTurno;

    private int turnos = 0;

    private Button[][] tablero = null;

    private void setTablero() {
        if (tablero != null)
            return;  // el tablero ya fue inicializado

        tablero = new Button[3][3];
        tablero[0][0] = button00;
        tablero[0][1] = button10;
        tablero[0][2] = button20;
        tablero[1][0] = button01;
        tablero[1][1] = button11;
        tablero[1][2] = button21;
        tablero[2][0] = button02;
        tablero[2][1] = button12;
        tablero[2][2] = button22;
    }

    private void reiniciarTablero() {
        int k = 1;
        turnos = 0;
        for(int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j].setText(String.valueOf((k)));
                tablero[i][j].setDisable(false);
                tablero[i][j].setStyle("-fx-background-color: #f0f0f0");
                k++;
            }
        }
    }

    /*

    "X" | "0" -> Gano la ficha correspondiente. "" -> No hay ganador

     */
    private String getGanador() {
        String s00 = button00.getText();
        String s01 = button01.getText();
        String s02 = button02.getText();
        String s10 = button10.getText();
        String s11 = button11.getText();
        String s12 = button12.getText();
        String s20 = button20.getText();
        String s21 = button21.getText();
        String s22 = button22.getText();
        if (s00.equals(s10) && s10.equals(s20)) {
            return s00;
        }

        if (s01.equals(s11) && s01.equals(s21)) {
            return s01;
        }

        if (s02.equals(s12) && s11.equals(s22)) {
            return s02;
        }

        if (s00.equals(s01) && s11.equals(s02)) {
            return s00;
        }

        if (s10.equals(s11) && s11.equals(s12)) {
            return s10;
        }

        if (s20.equals(s21) && s21.equals(s22)) {
            return s20;
        }

        if (s00.equals(s11) && s11.equals(s22)) {
            return s00;
        }

        if (s02.equals(s11) && s11.equals(s20)) {
            return s02;
        }

        return "";
    }

    private void manipularButton(Button b) {
        turnos++;

        labelTurno.setText(String.valueOf(turnos));

        setTablero();

        if (turnos % 2 == 0) {
            b.setText("0");
        } else {
            b.setText("X");
        }
        b.setDisable(true);
        b.setStyle("-fx-background-color: #00ff7f");  // CSS propio

        String ganador = getGanador();
        if (!ganador.equals("")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Felicidades!!!");
            alert.setHeaderText(null);
            alert.setContentText("Hay un ganador: " + ganador);
            alert.showAndWait();

            reiniciarTablero();
        }
    }

    @FXML
    protected void button00Click() {
        manipularButton(button00);
    }

    @FXML
    protected void button01Click() {
        manipularButton(button01);
    }

    @FXML
    protected void button02Click() {
        manipularButton(button02);
    }

    @FXML
    protected void button10Click() {
        manipularButton(button10);
    }

    @FXML
    protected void button11Click() {
        manipularButton(button11);
    }

    @FXML
    protected void button12Click() {
        manipularButton(button12);
    }

    @FXML
    protected void button20Click() {
        manipularButton(button20);
    }

    @FXML
    protected void button21Click() {
        manipularButton(button21);
    }

    @FXML
    protected void button22Click() {
        manipularButton(button22);
    }

}