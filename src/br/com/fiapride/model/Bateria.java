package br.com.fiapride.model;

public class Bateria extends Especificacao implements FichaTecnica {

    private String modelo;
    private int numeroPratos;
    private int numeroDeBumbos;
    private int numeroDeTambores;
    private Amplificador amplificador;

    public Bateria(String cor, String marca, String material, String tipo,String modelo,
                   int numeroPratos, int numeroDeTambores, int numeroDeBumbos) {

        setCor(cor);
        setMarca(marca);
        setMaterial(material);
        setTipo(tipo);
        this.modelo= modelo;
        this.numeroPratos = numeroPratos;
        this.numeroDeTambores = numeroDeTambores;
        this.numeroDeBumbos = numeroDeBumbos;
    }

    public Amplificador getAmplificador() {
        return amplificador;
    }

    public void setAmplificador(Amplificador amplificador) {
        this.amplificador = amplificador;
    }

    public int getNumeroDeBumbos() {
        return numeroDeBumbos;
    }

    public void setNumeroDeBumbos(int numeroDeBumbos) {
        this.numeroDeBumbos = numeroDeBumbos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



    public int getNumeroPratos() {
        return numeroPratos;
    }

    public void setNumeroPratos(int numeroPratos) {

        if (numeroPratos >= 0) {
            this.numeroPratos = numeroPratos;
        } else {
            System.out.println("Erro: numero de pratos nao pode ser negativo");
        }
    }

    public int getNumeroDeTambores() {
        return numeroDeTambores;
    }

    public void setNumeroDeTambores(int numeroDeTambores) {
        this.numeroDeTambores = numeroDeTambores;
    }

    public void totalDeComponentes() {
        int total = getNumeroPratos() + getNumeroDeBumbos() + getNumeroDeTambores();
        System.out.println("Total de componentes na bateria: " + total);
    }

    @Override
    public void exibirFichaTecnica() {
        System.out.println("Cor: " + getCor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Material: " + getMaterial());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Pratos: " + numeroPratos);
        System.out.println("Tambores: " + numeroDeTambores);
        System.out.println("Bumbos: " + numeroDeBumbos);

        if (amplificador != null && amplificador.isPresente()) {
            System.out.println("Tem amplificador: Sim");
            System.out.println("Marca do amplificador: " + amplificador.getMarca());
            System.out.println("Potência do amplificador: " + amplificador.getPotencia() + "W");
        } else {
            System.out.println("Tem amplificador: Não usa amplificador");
        }
    }
}