package main;

import java.util.Iterator;
import modell.Allat;
import modell.Borz;
import modell.Nyul;
import modell.Roka;
import modell.TerepTipus;
import modell.Verseny;

public class AllatVersenyProgram {

    private Verseny verseny;

    public static void main(String[] args) {
        new AllatVersenyProgram();
    }

    public AllatVersenyProgram() {
        verseny = new Verseny(4);
        verseny.benevez(new Borz());
        verseny.benevez(new Nyul());
        verseny.benevez(new Roka());
        System.out.println("RAJT: ----");
        System.out.println("Erdős terep: ----");
        verseny.ujSzakasz(TerepTipus.erdo);
       
        
        System.out.println("Dombos terep: ----");
        verseny.ujSzakasz(TerepTipus.dombos);
       
        
        System.out.println("Hegyes terep: ----");
        verseny.ujSzakasz(TerepTipus.hegyes);
        
        
        System.out.println("Sík terep: ----");
        verseny.ujSzakasz(TerepTipus.mezo);
       
        System.out.println("****************- - - - - - - - - -****************");

        System.out.println("***************- - - C - É - L - - - -**************");
        verseny.idoKiir();

    }

    public void versenyAllataitKiir() {
        for (String allat : verseny.getAllatokLeirasa()) {
            if (allat != null) {
                System.out.println(allat);
            }
        }
    }

}
