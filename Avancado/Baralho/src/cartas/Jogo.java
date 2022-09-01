package cartas;

public class Jogo {
    private Carta handPlayer;
    private Carta handCPU;
    private Baralho deck;
    private int playerWins;

    public void firstRound(){

    }
    public void handlePlayerOption(PlayerOption){
        //TODO
    }
    public void playerWin(){
        //todo
    }
    public void oneMore(){
        //todo
    }
    public void stop(){
        //todo
    }
    public void doubleCard(){
        //todo
    }

    //GET AND SET
    public Carta getHandPlayer() {
        return handPlayer;
    }

    public void setHandPlayer(Carta handPlayer) {
        this.handPlayer = handPlayer;
    }

    public Carta getHandCPU() {
        return handCPU;
    }

    public void setHandCPU(Carta handCPU) {
        this.handCPU = handCPU;
    }

    public Baralho getDeck() {
        return deck;
    }

    public void setDeck(Baralho deck) {
        this.deck = deck;
    }

    public int getPlayerWins() {
        return playerWins;
    }

    public void setPlayerWins(int playerWins) {
        this.playerWins = playerWins;
    }
}
