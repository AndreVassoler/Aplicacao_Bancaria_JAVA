package org.example.service.enums;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CriarNumFinanciamento {

    public static  String CriarNumFinanciamento() {
        Date dateAtual = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        String ano = dateFormat.format(dateAtual).substring(1);

        Random random = new Random();
        int numeroAleatorio = random.nextInt(10000);

        String numeroAleatorioFormatado = String.format("%010d", numeroAleatorio);

        return ano + numeroAleatorioFormatado;
    }
}
