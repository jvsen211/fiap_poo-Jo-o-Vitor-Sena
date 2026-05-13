package br.com.fiapride.model;

public class Guitarra {
    private String marca;
    private int numeroDeCordas;
    private String tipoCaptador;
    private boolean possuiAlavanca;
    private String tipo;
    private Amplificador amplificador;

    public Guitarra (String marca, int numeroDeCordas, String tipoCaptador, boolean possuiAlavanca, String tipo){
        this.marca= marca;
        this.numeroDeCordas = numeroDeCordas;
        this.tipo = tipo;
        this.tipoCaptador = tipoCaptador;
        this.possuiAlavanca = possuiAlavanca;
    }

    public Amplificador getAmplificador() {
        return amplificador;
    }

    public void setAmplificador(Amplificador amplificador) {
        this.amplificador = amplificador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroDeCordas() {
        return numeroDeCordas;
    }

    public void setNumeroDeCordas(int numeroDeCordas) {
        this.numeroDeCordas = numeroDeCordas;
    }

    public String getTipoCaptador() {
        return tipoCaptador;
    }

    public void setTipoCaptador(String tipoCaptador) {
        this.tipoCaptador = tipoCaptador;
    }

    public boolean isPossuiAlavanca() {
        return possuiAlavanca;
    }

    public void setPossuiAlavanca(boolean possuiAlavanca) {
        this.possuiAlavanca = possuiAlavanca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void exibirFichaTecnica() {
        System.out.println("Tipo (Eletronica / Acustica ): " + tipo);
        System.out.println("Numero de cordas: " + numeroDeCordas);
        System.out.println("Tipo de captador: " + tipoCaptador);
        System.out.println("Possui alavanca: " + possuiAlavanca);
        if(amplificador != null && amplificador.isPresente()) {
            System.out.println("Tem amplificador: Sim");
        } else {
            System.out.println("Tem amplificador: Não");
        }
    }


}
