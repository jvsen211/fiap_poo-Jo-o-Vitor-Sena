package br.com.fiapride.model;

public class Bateria {

        private String modelo;
        private String tipo;
        private int numeroPratos;
        private int numeroDeBumbos;
        private int numeroDeTambores;

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

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public int getNumeroPratos() {
            return numeroPratos;
        }

        public void setNumeroPratos(int numeroPratos) {
            this.numeroPratos = numeroPratos;
        }

        public int getNumeroDeTambores() {
            return numeroDeTambores;
        }

        public void setNumeroDeTambores(int numeroDeTambores) {
            this.numeroDeTambores = numeroDeTambores;
        }

        public void TotaldeComponentes() {
            int total = getNumeroPratos() + getNumeroDeBumbos() + getNumeroDeTambores();

            System.out.println("Total de componentes na Bateria: " + total);
        }

    public void exibirFichaTecnica() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Numero de pratos: " + getNumeroPratos());
        System.out.println("Numero de tambores: " + getNumeroDeTambores());
    }
    }

