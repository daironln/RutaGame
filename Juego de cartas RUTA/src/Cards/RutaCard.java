package Cards;

import Game.*;

public abstract class RutaCard {
    private CardType type;
    private String description;
    private Efect<CardType> efect;

    public RutaCard(CardType type, String description){
        this.type = type;
        this.description = description;
        efect = new Efect<CardType>(type);
    }

    public abstract void PlayCard(Player player);

    public CardType getType(){
        return type;
    }
    public String getDescription(){
        return description;
    }
    public Efect<CardType> getEfect(){
        return efect;
    }
}
