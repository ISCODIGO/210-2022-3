package com.example.dados;

public class Dado implements Comparable<Dado> {
    private static final int MAX_LADOS = 6;
    private int valor;

    public int getValor() {
        return this.valor;
    }

    public void setValor() {
        this.valor = (int) (Math.random() * 6 + 1);
    }

    @Override
    public String toString() {
        return String.valueOf(getValor());
    }

    @Override
    public int compareTo(Dado o) {
        // comparar si entre dos dados son iguales, menor o mayor que el otro
        return this.getValor() - o.getValor();
    }
}
