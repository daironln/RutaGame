package Cards;

import Game.Player;

public class ViaLibre extends RutaCard implements IComodin{
    public boolean isContra = false;
    public ViaLibre() {
        super(CardType.Shield, "Son las cartas\n" +
                "más importantes del juego y sirven para prevenir y hacerse invulnerable a los\n" +
                "Ataques de los jugadores rivales.");
    }
    @Override
    public void PlayCard(Player player) {
        getEfect().Activate();
        player.VIALIBRE = true;
    }
    @Override
    public void PlayCard(Player player, boolean isContra) {
        getEfect().Activate();
        this.isContra = isContra;
        if(!isContra)
            player.VIALIBRE = true;
    }
}
