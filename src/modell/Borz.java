/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author Suhajda Bea
 */
public class Borz extends Allat {
    
    public Borz() {
        super("Borz");
        setKitartas(100);
        setSebesseg(25);
    }
   
    @Override
    public String statuszSzoveg() {
        return "Borz vagyok!";
    }
    
    @Override
    public int ujSzakaszhozEr(TerepTipus terepTipus, int tavolsag){
        
        // kiszámoljuk, hogy feladja-e az állat ezen a terepen. 
        if (!farad(tavolsag * getRandom().nextInt(2, 5))) {
            // Ha nem, akkor kiszámoljuk, hogy mennyi idő alatt ér át rajta.
            int reszido = (tavolsag * 1000  / getSebesseg());
            idotHozzaad(reszido);
            return reszido;
        } else {
            // Ha igen, -1-gyel tér vissza a függvény.
            return -1;
        }
    }
}
