package br.com.fiapride.model;

public class Amplificador {
    private String marca;
    private int potencia;
    private boolean presente;

    public Amplificador(boolean presente, String marca, int potencia) {
        this.presente = presente;
        this.marca = marca;
        this.potencia = potencia;
    }

    // getters e setters
    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}

