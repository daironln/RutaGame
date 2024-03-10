package Game;

import java.util.ArrayList;
import java.util.List;

public class Game implements IRutaGame {
    //#region VARIABLES
    private Maso maso;
    private List<Player> players;
    private List<Tablero> tableros;
    private int current;
    //#endregion

    //#region CONSTRUCTOR
    public Game(String[] names) throws Exception {
        players = new ArrayList<>();
        tableros = new ArrayList<>();
        maso = new Maso();

        current = 0;

        for(int i = 0; i < names.length; i++){
            players.add(new Player(names[i], new Tablero()));
            tableros.add(players.get(i).getTablero());
        }

        maso.Shuffle();
        Distribute(maso);
    }
    //#endregion

    //#region CLASSMETHODS
    public void Distribute(Maso maso){

        for (var j : players) {
            for (int i = 1; i <= 6; i++) {
                j.getHand().add(maso.Pop());
            }
        }
    }
    public Player getCurrentPlayer(){
        return players.get(current);
    }
    public List<Tablero> getTableros(){
        return tableros;
    }
    public void Pass(){
        current ++;
        if(current >= players.size())
            current = 0;
    }
    public  Player getPlayer(int index){
        return players.get(index);
    }
    public Maso getMaso(){
        return maso;
    }

    public void Winn(Player player){
        System.out.println(player.getName());
    }
    //#endregion


}