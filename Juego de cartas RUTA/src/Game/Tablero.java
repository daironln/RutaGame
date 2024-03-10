package Game;

import Cards.RutaCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tablero {
    //#region VARIABLES
    private Stack<RutaCard> SPEED_STACKS;
    private Stack<RutaCard> AT_DF_STACKS;
    private List<RutaCard> SHIELDS;
    private List<List<RutaCard>> KM;
    private Stack<RutaCard> DESECHO;
    //#endregion

    //#region CONSTRUCTOR
    public Tablero(){
        SHIELDS = new ArrayList<>();
        AT_DF_STACKS = new Stack<>();
        SPEED_STACKS = new Stack<>();
        DESECHO = new Stack<>();
        KM = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            KM.add(new ArrayList<>());
        }
    }
    //#endregion

    //#region CLASSMETHODS
    public Stack<RutaCard> getSPEED_STACKS(){
        return SPEED_STACKS;
    }
    public Stack<RutaCard> getAT_DF_STACKS(){
        return AT_DF_STACKS;
    }
    public List<RutaCard> getSHIELDS(){
        return SHIELDS;
    }
    public List<List<RutaCard>> getKM(){
        return KM;
    }
    public Stack<RutaCard> getDESECHO(){
        return DESECHO;
    }
    //#endregion

}
