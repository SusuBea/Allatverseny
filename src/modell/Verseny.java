package modell;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Verseny {

    private Allat[] allatok;
    private int allatDb;
    private boolean zajlik;
    private int tav;
    int ido;

    public Verseny() {
        this(5);
    }

    public Verseny(int db) {
        allatDb = 0;
        allatok = new Allat[db];
        zajlik = true;
        tav = 100;
        ido = 0;
       
    }

    public void benevez(Allat allat) {
        if (allatDb < allatok.length) {
            allatok[allatDb++] = allat;
        } else {
            System.out.println("A versenylétszám megtelt.");
        }
    }

    public void halad(Nev){ 
        int i = 0;
        while(allatok[i] == null || i < allatDb && !(allatok[i].getNev().equals(Nev))){
            i++;
        }if( i < allatDb){
            ido = allatok[i].sebesseg * tav;
        }

       
    }



public void kiszall(String Nev) {
        int i = 0;
        while (allatok[i] == null || i < allatDb && !(allatok[i].getNev().equals(Nev))) {
            i++;
        }
        if (i < allatDb) {
            System.out.println(String.format("A versenyből %s kiszállt!", Nev));
            allatok[i] = null;
        } else {
            System.out.println("Nincs ilyen játékos versenyben!");
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
    
    
        public List<Allat> getAllatok(){
        List<Allat> allatokListaja = Arrays.asList(allatok);
        return Collections.unmodifiableList(allatokListaja);
        
    }

}
