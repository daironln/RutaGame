package Cards;

import Game.Player;

public class LimiteVelocidad extends RutaCard {
    public LimiteVelocidad() {
        super(CardType.Atack, "Se emplean para entorpecer el avance\n" +
                "kilométrico y se juegan únicamente sobre la pila de Ataques y Defensas de los\n" +
                "jugadores rivales.\n" +
                "Nunca se podrá colocar una Carta Ataque sobre otra Carta Ataque.");
    }
    @Override
    public void PlayCard(Player player) {
        getEfect().Activate();
        player.isSpeedLimited = true;
    }
}
