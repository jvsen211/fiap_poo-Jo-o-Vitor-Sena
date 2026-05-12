package br.com.fiapride.main;

import br.com.fiapride.model.Bateria;


public class InstrumentosPrincipal {
    public static void main(String[] args) {
        Bateria bateria = new Bateria();

        bateria.setModelo("Classico");
        bateria.setTipo("Acustica");
        bateria.setNumeroPratos(3);
        bateria.setNumeroDeTambores(4);
        bateria.setNumeroDeBumbos(2);
        bateria.TotaldeComponentes();
        bateria.exibirFichaTecnica();
    }
}

