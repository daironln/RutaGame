package Game;

import Cards.*;

import java.util.Collections;
import java.util.Stack;

public class Maso {
    //#region VARIABLES
    private Stack<RutaCard> carts;
    //#endregion

    //#region CONSTRUCTOR
    public Maso(){
        carts = new Stack<>();

        for (int k = 1; k <= 3; k++) {
            carts.push(new SinGasolina());
        }
        for (int k = 1; k <= 3; k++) {
            carts.push(new Pinchazo());
        }
        for (int k = 1; k <= 3; k++) {
            carts.push(new Accidente());
        }
        for (int k = 1; k <= 4; k++) {
            carts.push(new LimiteVelocidad());
        }
        for (int k = 1; k <= 5; k++) {
            carts.push(new Pare());
        }
        for (int k = 1; k <= 6; k++) {
            carts.push(new Gasolina());
        }
        for (int k = 1; k <= 6; k++) {
            carts.push(new LlantaRespuesto());
        }
        for (int k = 1; k <= 6; k++) {
            carts.push(new Reparacion());
        }
        for (int k = 1; k <= 6; k++) {
            carts.push(new FinLimiteVelocidad());
        }
        for (int k = 1; k <= 14; k++) {
            carts.push(new Siga());
        }
        carts.push(new Cisterna());
        carts.push(new LlantaIrrompible());
        carts.push(new ViaLibre());
        carts.push(new AzAlVolante());

        for (int k = 1; k <= 4; k++) {
            carts.push(new Km200());
        }
        for (int k = 1; k <= 12; k++) {
            carts.push(new Km100());
        }
        for (int k = 1; k <= 10; k++) {
            carts.push(new Km75());
        }
        for (int k = 1; k <= 10; k++) {
            carts.push(new Km50());
        }
        for (int k = 1; k <= 10; k++) {
            carts.push(new Km25());
        }
    }
    //#endregion

    //#region CLASSMETHODS
    public Stack<RutaCard> getCarts(){
        return carts;
    }
    public void Shuffle() throws Exception{
        if(!carts.isEmpty())
            Collections.shuffle(carts);
        else throw new Exception("No se puede barajar");
    }
    public boolean isEmpty(){
        return carts.isEmpty();
    }
    public RutaCard Pop(){
        return carts.pop();
    }
    public void Debug(){
        System.out.println(carts);
    }
    //#endregion
}
