import Game.Game;

public class Main {
    //TESTED
    public static void main(String[] args) throws Exception {
        String[] names = new String[]{"Pepe", "Juan", "Pablo"};
        Game game = new Game(names);
        game.Pass();
        System.out.println(game.getCurrentPlayer().getName());
        System.out.println(game.getCurrentPlayer().getHand());
        game.getCurrentPlayer().Play(game.getCurrentPlayer().getHand().get(2),
                game.getPlayer(0).getTablero());

        System.out.println(game.getCurrentPlayer().getHand());

        System.out.println(game.getPlayer(1).getTablero().getKM() );
        System.out.println(game.getPlayer(1).getTablero().getSHIELDS() );
        System.out.println(game.getPlayer(1).getTablero().getAT_DF_STACKS() );
        System.out.println(game.getPlayer(1).getTablero().getSPEED_STACKS() );
        System.out.println("--------");
        System.out.println(game.getPlayer(0).getTablero().getKM() );
        System.out.println(game.getPlayer(0).getTablero().getSHIELDS() );
        System.out.println(game.getPlayer(0).getTablero().getAT_DF_STACKS() );
        System.out.println(game.getPlayer(0).getTablero().getSPEED_STACKS() );

    }
}
