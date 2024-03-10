package Game;

public interface IRutaGame {
    public void Distribute(Maso maso);
    public Player getCurrentPlayer();
    public Player getPlayer(int index);
    public void Winn(Player player);

}
