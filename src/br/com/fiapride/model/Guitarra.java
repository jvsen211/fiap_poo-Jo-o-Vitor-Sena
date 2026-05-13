package br.com.fiapride.model;

public class Guitarra extends Especificacao{
    private int numeroDeCordas;
    private String tipoCaptador;
    private boolean possuiAlavanca;
    private Amplificador amplificador;

    public Guitarra(String cor, String marca, String material, String tipo,
                    int numeroDeCordas, String tipoCaptador, boolean possuiAlavanca) {

        setCor(cor);
        setMarca(marca);
        setMaterial(material);
        setTipo(tipo);
        this.numeroDeCordas = numeroDeCordas;
        this.tipoCaptador = tipoCaptador;
        this.possuiAlavanca = possuiAlavanca;
    }

    public Amplificador getAmplificador() {
        return amplificador;
    }

    public void setAmplificador(Amplificador amplificador) {
        this.amplificador = amplificador;
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

    public void exibirFichaTecnica() {
        System.out.println("Cor: " + getCor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Material: " + getMaterial());
        System.out.println("Tipo (Eletronica / Acustica ): " +getTipo());
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
