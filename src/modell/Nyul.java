/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author Suhajda Bea
 */
public class Nyul extends Allat {

    public Nyul() {
        super("Nyul");
        setKitartas(60);
        setSebesseg(40);
    }

    @Override
    public String statuszSzoveg() {
        return "Én, a nyuszi!";
    }

    @Override
public int ujSzakaszhozEr(TerepTipus terepTipus, int tavolsag) {
    // kiszámoljuk, hogy feladja-e az állat ezen a terepen.
    if (!farad(tavolsag * getRandom().nextInt(2, 5))) {
        // Ha nem, akkor kiszámoljuk, hogy mennyi idő alatt ér át rajta.
        int reszido = tavolsag * 1000  / getSebesseg();
        idotHozzaad(reszido);
        return reszido;
    } else {
        // Ha igen, beállítjuk az állatot versenyen kívülinek.
        setVersenyben(false);
        // -1-gyel térünk vissza a függvényből.
        return -1;
    }
}
}
