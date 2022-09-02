package cartas;

public enum Naipe {
    OURO("Ouro"), PAUS("Paus"), COPAS("Copas"), ESPADAS("Espadas");

    private final String naipe;

    public String getNaipe() {
        return naipe;
    }

    Naipe(String naipe) {
        this.naipe = naipe;
    }
}