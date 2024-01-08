package modell;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Verseny {

    private Allat[] allatok;
    private int allatDb;
    private boolean zajlik;
    private int osszTav;
    private static final Random rnd = new Random();

    public Verseny() {
        this(5);
    }

 
    
    public void ujSzakasz(TerepTipus terepTipus) {
        int tav = rnd.nextInt(1, 4);
        osszTav += tav;
        for (Allat allat : allatok) {
            if (allat != null) {
                int reszido = allat.ujSzakaszhozEr(terepTipus, tav);
                allat.idotHozzaad(reszido);
                if(reszido < 0){
                    System.out.println(allat.getNev() + " feladta!");
                    allat = null;    
                } else {
                    System.out.println("A " + allat.getNev() + " " + reszido + " másodperc alatt teljesítette a távot!!");
                }
            }
        }

    }

    public Verseny(int db) {
        allatDb = 0;
        allatok = new Allat[db];
        zajlik = true;
        osszTav = 0;

    }

    public void benevez(Allat allat) {
        System.out.println(allat.statuszSzoveg());
        if (allatDb < allatok.length) {
            allatok[allatDb++] = allat;
        } else {
            System.out.println("A versenylétszám megtelt.");
        }
    }


    public Allat keres(String Nev) {
        int i = index(Nev);
        if (i >= 0) {
            return allatok[i];
        } else {
            return null;
        }
    }

    public int index(String Nev) {
        int i = 0;
        while (i < allatDb && (allatok[i] == null || !(allatok[i].getNev().equals(Nev)))) {
            i++;
        }
        if (i < allatDb) {
            return i;
        } else {
            return -1;
        }
    }
    
    public void idoKiir(){
        
        for (Allat allat : allatok) {
            if (allat != null){
            System.out.println(String.format("%s %d másodperc alatt teljesített az össztávot.", allat.getNev(), allat.getIdo()));
        
        }
    }
    }
    
    public String[] getAllatokLeirasa() {
        String[] allatok = new String[this.allatok.length];
        for (int i = 0; i < allatDb; i++) {
            Allat a = this.allatok[i];
            if (a != null) {
                allatok[i] = a.getNev() + " versenyző";
                allatok[i] += a.isVersenyben() ? "  versenyben van" : " nincs versenyben";
            }
        }
        return allatok;
    }


}
