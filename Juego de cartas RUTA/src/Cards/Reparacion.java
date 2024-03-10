package Cards;

import Game.Player;

public class Reparacion extends RutaCard {
    public Reparacion() {
        super(CardType.Defence, "Se juegan solamente en la propia pila de "+
                "Ataques y Defensas \n(nunca en la pila de un jugador contrario), para contrarrestar el"+
                "efecto\n de las cartas Ataques que haya podido colocar un rival.");
    }
    @Override
    public void PlayCard(Player player) {
        getEfect().Activate();
        player.isAccident = false;
    }
}
