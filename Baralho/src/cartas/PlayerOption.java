package cartas;

public enum PlayerOption {
    COMEÇAR("COMEÇAR"), PARAR("PARAR");

    MAISUMA("MAIS UMA");

    private int value;
    private String description;

    PlayerOption(String description) {
        this.description = description;
    }

}