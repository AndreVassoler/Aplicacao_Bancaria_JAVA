package org.example.service.enums;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CriarContaPessoa {
    public static String CriarContaPessoa() {
        Date dataAtual = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        String ano = dateFormat.format(dataAtual).substring(1);

        Random random = new Random();
        Random randomDigito = new Random();
        int numeroAleatorio = random.nextInt(10000);
        int digitoAleatorio = randomDigito.nextInt(10);

        String geraNumeroAleatorio = String.format("%04d", numeroAleatorio) + "-" + digitoAleatorio;

        return ano + geraNumeroAleatorio;
    }
}
