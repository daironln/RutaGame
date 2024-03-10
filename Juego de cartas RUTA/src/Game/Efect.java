package Game;

import Cards.CardType;

public class Efect<T extends CardType> {
    private final T type;

    public Efect(T type){
        this.type = type;
    }
    public void Activate(){
        if(type != null){
            switch ((CardType)type){
                case Atack -> System.out.println("Attack");
                case Defence -> System.out.println("Defence");
                case Shield -> System.out.println("Shield");
                case Kilometrics -> System.out.println("Kilometrics");
            }
        }

    }
}
