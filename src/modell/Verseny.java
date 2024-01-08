package modell;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Verseny {

    private Allat[] allatok;
    private int allatDb;
    private boolean zajlik;
    private int tav;


    public Verseny() {
        this(5);
    }

    public Verseny(int db) {
        allatDb = 0;
        allatok = new Allat[db];
        zajlik = true;
        tav = 100;
       
    }

    public void benevez(Allat allat) {
        if (allatDb < allatok.length) {
            allatok[allatDb++] = allat;
        } else {
            System.out.println("A versenylétszám megtelt.");
        }
    }

    public void halad(String Nev, int sebesseg){ 
        int i = 0;
        while(allatok[i] == null || i < allatDb && !(allatok[i].getNev().equals(Nev))){
            i++;
        }if( i < allatDb){
             allatok[i].ido =  tav / sebesseg;
             allatok[i].setCelbaEr(true);
            System.out.println(String.format("%s  ideje : %d km/h", allatok[i].getNev(), allatok[i].ido));
            
        }
    }



public void kiszall(String Nev) {
        int i = 0;
        while (allatok[i] == null || i < allatDb && !(allatok[i].getNev().equals(Nev))) {
            i++;
        }
        if (i < allatDb) {
            System.out.println(String.format("%s kiesett a versenyből!", Nev));
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
    
    
    
        public String[] getAllatokLeirasa2() {
        String[] allatok = new String[this.allatok.length];    
        for (int i = 0; i < allatDb; i++) {
            Allat a = this.allatok[i];
            int elso = this.allatok[0].sebesseg;
            String nyertes = "";
            if(this.allatok[i].sebesseg > elso) {
               nyertes += this.allatok[i];

                }  
            }
                return nyertes;
        } 
       
    
    
    
        public List<Allat> getAllatok(){
        List<Allat> allatokListaja = Arrays.asList(allatok);
        return Collections.unmodifiableList(allatokListaja);
        
    }
        
        
        

}


