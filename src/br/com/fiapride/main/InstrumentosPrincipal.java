package br.com.fiapride.main;

import br.com.fiapride.model.Bateria;


public class InstrumentosPrincipal {
    public static void main(String[] args) {
        Bateria bateria = new Bateria(
                "Classico","Acustica",
                3,4,
                2);
        bateria.totalDeComponentes();
        bateria.exibirFichaTecnica();
    }
}

