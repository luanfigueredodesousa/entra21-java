package cartas;

import java.util.ArrayList;

public enum ValorCarta {

    UM("Um"), DOIS("Dois"), TRES("Três"), QUATRO("Quatro"),
    CINCO("Cinco"), SEIS("Seis"), SETE("Sete"), OITO("Oito"), NOVE("Nove"),
    DEZ("Dez"), VALETE("Valete"), DAMA("Dama"), REI("Rei");
    private final String valor;

    ValorCarta(String valor) {
        this.valor = valor;
    }
}
