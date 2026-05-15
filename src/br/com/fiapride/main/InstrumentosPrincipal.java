package br.com.fiapride.main;

import br.com.fiapride.model.Amplificador;
import br.com.fiapride.model.Bateria;
import br.com.fiapride.model.Guitarra;


public class InstrumentosPrincipal {
    public static void main(String[] args) {
        System.out.println("----Bateria----");
        Bateria bateria = new Bateria(
                "Preta",
                "Roland",
                "Madeira: Maple",
                "Acustica",
                "Classico",
                3,
                4,
                2
        );
        bateria.totalDeComponentes();
        bateria.exibirFichaTecnica();
        System.out.println();
        System.out.println("----Guitarra----");

        Guitarra guitarra = new Guitarra();

        Amplificador amplificadorGuitarra = new Amplificador(
                true, "Roland", 150);
        guitarra.setAmplificador(amplificadorGuitarra);

        guitarra.exibirFichaTecnica();

    }

}

