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

    /**
     * Funcion que permite obtener el Path de cada imagen
     * @return
     */
    public String[] getImagenes() {

        return new String[]{
                String.format("images/%s.png", dado1.getValor()),
                String.format("images/%s.png", dado2.getValor())
        };
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
