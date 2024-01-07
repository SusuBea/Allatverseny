
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
        
        versenyAllataitKiir();
    
    } 

        
 
 public void versenyAllataitKiir(){
     for(String allat: verseny.getAllatokLeirasa()){
         if( allat != null){
             System.out.println(allat);
         }
     }
}
 
 

    
}






