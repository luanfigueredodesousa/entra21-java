package cartas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Baralho extends Carta {
    private ArrayList<Carta> cartas = new ArrayList<>();


    Baralho() {

        for (Naipe n : Naipe.values()) {
            int valorCarta = 1;
            for (ValorCarta vc : ValorCarta.values()) {
                Carta c = new Carta();
                c.setValor(vc);
                c.setNaipe(n);
                cartas.add(c);
                valorCarta++;
            }
        }
        shuffle();
    }
    public void shuffle(){
            Collections.shuffle(cartas);
        }

            /*for (Carta c : baralho) {
                System.out.println(c.getNaipe().getNaipe()+" "+c.getValor().getValor()+" "+c.getNaipe().getNaipe());
            }*/


    public Carta getFromTop(){
        return.this.cartas.remove(0);
    }
    public Carta getFromBottom(){
        return.this.cartas.remove(this.cartas.size()-1);
        return null;
    }
    public Carta searchCard(Naipe naipe, ValorCarta valor){
        return this.cartas.stream().filter(
                carta -> naipe.equals((carta.getNaipe()) &&
                        valor.equals(carta.getValor())
                ).findFirst.orElse(null);
    }
    public Carta searchCard(Naipe naipe, int valorReal){
        return null;
    }
    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
}
