
package main;

import modell.Allat;
import modell.Verseny;


public class AllatVersenyProgram {
    private Verseny verseny;
   
    public static void main(String[] args) {
        new AllatVersenyProgram();
    }
    
    public  AllatVersenyProgram(){
        verseny = new Verseny(4);
        verseny.benevez(new Allat("Borz"));
        verseny.benevez(new Allat("Nyúl"));
        verseny.benevez(new Allat("Róka"));
        System.out.println("RAJT: ----");
        versenyAllataitKiir();
        
        System.out.println("******- - - -******");
        verseny.halad("Borz", 8);
        verseny.kiszall("Nyúl");
        verseny.halad("Róka", 15);
        System.out.println("CÉL: ----");
        celAllataitKiir();
 
    } 

        
 
 public void versenyAllataitKiir(){
     for(String allat: verseny.getAllatokLeirasa()){
         if( allat != null){
             System.out.println(allat);
         }
     }
}
 
 
  public void celAllataitKiir(){
     for(String allat: verseny.getAllatokLeirasa2()){
         if( allat != null){
             System.out.println(allat);
         }
     }
}
 
 

    
}






