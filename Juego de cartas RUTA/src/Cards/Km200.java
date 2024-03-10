package Cards;

import Game.Player;

public class Km200 extends RutaCard {
    public Km200() {
        super(CardType.Kilometrics, "Al exponer sobre la mesa, Se van\n" +
                "sumando sus valores al objeto de observar qué nos queda para alcanzar los 1.000\n" +
                "km. que se precisan para ganar un juego parcial.\n");
    }

    @Override
    public void PlayCard(Player player){
        getEfect().Activate();
        player.setScore(player.getScore() + 200);
    }
}
