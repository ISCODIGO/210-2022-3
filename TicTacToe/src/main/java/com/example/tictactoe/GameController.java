package com.example.tictactoe;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GameController {
    @FXML private Button button1;
    @FXML private Button button2;
    @FXML private Button button3;
    @FXML private Button button4;
    @FXML private Button button5;
    @FXML private Button button6;
    @FXML private Button button7;
    @FXML private Button button8;
    @FXML private Button button9;
    @FXML private Label labelTurno;

    private int turnos = 0;

    private Button[][] tablero = null;

    private void setTablero() {
        if (tablero != null)
            return;  // el tablero ya fue inicializado

        tablero = new Button[3][3];
        tablero[0][0] = button1;
        tablero[0][1] = button2;
        tablero[0][2] = button3;
        tablero[1][0] = button4;
        tablero[1][1] = button5;
        tablero[1][2] = button6;
        tablero[2][0] = button7;
        tablero[2][1] = button8;
        tablero[2][2] = button9;
    }

    private void reiniciarTablero() {
        int k = 1;
        turnos = 0;
        labelTurno.setText("Turnos: 0");
        for(int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j].setText(String.valueOf((k)));
                tablero[i][j].setDisable(false);
                tablero[i][j].setStyle("-fx-background-color: #f0f0f0; -fx-border-color: #000000; -fx-border-radius: 5;");
                k++;
            }
        }
    }

    /*

    "X" | "0" -> Gano la ficha correspondiente. "" -> No hay ganador

     */
    private String getGanador() {
        String s1 = button1.getText();
        String s2 = button2.getText();
        String s3 = button3.getText();
        String s4 = button4.getText();
        String s5 = button5.getText();
        String s6 = button6.getText();
        String s7 = button7.getText();
        String s8 = button8.getText();
        String s9 = button9.getText();

        if (s1.equals(s2) && s2.equals(s3)) {
            return s1;
        }

        if (s4.equals(s5) && s4.equals(s6)) {
            return s4;
        }

        if (s7.equals(s8) && s8.equals(s9)) {
            return s7;
        }

        if (s1.equals(s4) && s4.equals(s7)) {
            return s1;
        }

        if (s2.equals(s5) && s5.equals(s8)) {
            return s2;
        }

        if (s3.equals(s6) && s6.equals(s9)) {
            return s3;
        }

        if (s1.equals(s5) && s5.equals(s9)) {
            return s1;
        }

        if (s3.equals(s5) && s5.equals(s7)) {
            return s3;
        }

        return "";
    }

    private void manipularButton(Button b) {
        labelTurno.setText("Turnos: " + (++turnos));
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

    @FXML protected void button00Click() {
        manipularButton(button1);
    }

    @FXML protected void button01Click() {
        manipularButton(button4);
    }

    @FXML protected void button02Click() {
        manipularButton(button7);
    }

    @FXML protected void button10Click() {
        manipularButton(button2);
    }

    @FXML protected void button11Click() {
        manipularButton(button5);
    }

    @FXML protected void button12Click() {
        manipularButton(button8);
    }

    @FXML protected void button20Click() {
        manipularButton(button3);
    }

    @FXML protected void button21Click() {
        manipularButton(button6);
    }

    @FXML protected void button22Click() {
        manipularButton(button9);
    }

}