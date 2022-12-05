package com.example.dados;

public class Juego implements Comparable<Juego> {
    private Dado dado1;
    private Dado dado2;
    private int valor;

    public Juego() {
        dado1 = new Dado();
        dado2 = new Dado();
    }

    public void lanzar() {
        dado1.setValor();
        dado2.setValor();
        this.valor = dado1.getValor() + dado2.getValor();
    }

    public int getValor() {
        return this.valor;
    }

    public String[] getImagenes() {
        String[] recursos = {
                dado1.getValor() + ".png",
                dado2.getValor() + ".png"
        };

        return recursos;
    }

    @Override
    public String toString() {
        return String.valueOf(this.valor);
    }

    @Override
    public int compareTo(Juego o) {
        return this.getValor() - o.getValor();
    }
}
