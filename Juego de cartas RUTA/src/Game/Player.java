package Game;

import Cards.*;

import java.util.ArrayList;
import java.util.List;

public class Player {
    //#region VARIABLES
    private final String name;
    private int score;
    private Tablero tablero;
    private List<RutaCard> hand;
    //#endregion

    //#region STATS
    public boolean isAccident = false;
    public boolean isWithoutGass = false;
    public boolean isPinch = false;
    public boolean canRoad = false;
    public boolean isSpeedLimited = false;
    //#endregion

    //#region SHIELDS
    public boolean CISTERNA = false;
    public boolean LLANTAIRROMPIBLE = false;
    public boolean VIALIBRE = false;
    public boolean AZALVOLANTE = false;
    //#endregion

    //#region CONSTRUCTOR
    public Player(String name, Tablero tablero){
        this.name = name;
        this.score = 0;
        this.tablero = tablero;
        hand = new ArrayList<>();
    }
    //#endregion

    //#region CLASSMETHODS
    public void Play(RutaCard card, Tablero tablero) throws Exception{
        if((card.getType() == CardType.Defence && !(card instanceof FinLimiteVelocidad))){
            this.tablero.getAT_DF_STACKS().push(card);
            card.PlayCard(this);
            hand.remove(card);
        }else if((card.getType() == CardType.Atack && !(card instanceof LimiteVelocidad))){
            tablero.getAT_DF_STACKS().push(card);
            card.PlayCard(this);
            hand.remove(card);
        }else if(card instanceof FinLimiteVelocidad){
            this.tablero.getSPEED_STACKS().push(card);
            card.PlayCard(this);
            hand.remove(card);
        }else if(card instanceof LimiteVelocidad){
            tablero.getSPEED_STACKS().push(card);
            card.PlayCard(this);
            hand.remove(card);
        }else if(card.getType() == CardType.Shield){
            this.tablero.getSHIELDS().add(card);
            PlayComodin(card, true);
            hand.remove(card);
        }else if(card.getType() == CardType.Kilometrics){
            switch (card) {
                case Km200 km200 -> {
                    this.tablero.getKM().get(0).add(card);
                    ((Km200) card).PlayCard(this);
                }
                case Km100 km100 -> {
                    this.tablero.getKM().get(1).add(card);
                    ((Km100) card).PlayCard(this);
                }
                case Km75 km75 -> {
                    this.tablero.getKM().get(2).add(card);
                    ((Km75) card).PlayCard(this);
                }
                case Km50 km50 -> {
                    this.tablero.getKM().get(3).add(card);
                    ((Km50) card).PlayCard(this);
                }
                case Km25 km25 -> {
                    this.tablero.getKM().get(4).add(card);
                    ((Km25) card).PlayCard(this);
                }
                case null, default -> {
                    throw new Exception("No se puede jugar esa carta");
                }
            }
            hand.remove(card);
        }else throw new Exception("No se puede jugar esa carta");
    }
    public void PlayComodin(RutaCard card, boolean isContra){
        ((IComodin) card).PlayCard(this, isContra);
    }
    public void Thief(Maso maso) throws Exception{
        if(hand.size() < 6 && !maso.isEmpty()){
            hand.add(maso.Pop());
        }else throw new Exception("No se puede robar una carta");
    }
    public void Discard(RutaCard card) throws Exception{
        if(!hand.isEmpty()){
            tablero.getDESECHO().push(card);
            hand.remove(card);
        }
        else throw new Exception("La carta no esta en la mano");
    }

    public String getName(){
        return  name;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int value){
        score = value;
    }
    public Tablero getTablero(){
        return tablero;
    }
    public List<RutaCard> getHand(){
        return hand;
    }
    //#endregion

}
