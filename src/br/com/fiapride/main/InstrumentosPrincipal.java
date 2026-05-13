package br.com.fiapride.main;

import br.com.fiapride.model.Amplificador;
import br.com.fiapride.model.Bateria;
import br.com.fiapride.model.Guitarra;


public class InstrumentosPrincipal {
    public static void main(String[] args) {
        Bateria bateria = new Bateria(
                "Classico",
                "Acustica",
                3,
                4,
                2);
        bateria.totalDeComponentes();
        bateria.exibirFichaTecnica();

        System.out.println("----Guitarra----");

        Guitarra guitarra = new Guitarra(
                "Stratocaster",
                6,
                "Humbucker",
                true,
                "Eletronica");

        Amplificador amplificadorGuitarra = new Amplificador(
                true,
                "Fender",
                100);
        guitarra.setAmplificador(amplificadorGuitarra);

        guitarra.exibirFichaTecnica();

    }

}

