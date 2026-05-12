package br.com.fiapride.main;

import br.com.fiapride.model.Bateria;


public class InstrumentosPrincipal {
    public static void main(String[] args) {
        Bateria bateria = new Bateria();

        bateria.setModelo("Classico");
        bateria.setTipo("Acustica");
        bateria.setNumeroPratos(3);
        bateria.setNumeroDeTambores(4);

        System.out.println("Modelo: " + bateria.getModelo());
        System.out.println("Tipo: " + bateria.getTipo());
        System.out.println("Pratos: " + bateria.getNumeroPratos());
        System.out.println("Tambores: " + bateria.getNumeroDeTambores());
    }
}

