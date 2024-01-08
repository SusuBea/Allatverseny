package modell;

import java.util.Random;

public abstract class Allat {

    private String Nev;
    private boolean versenyben;
    private boolean celbaEr;
    private int sebesseg;
    private int ido;
    private int kitartas;

    private static final Random rnd = new Random();

    public static Random getRandom() {
        return rnd;
    }

    ;
    
    
    public Allat(String Nev) {
        this.Nev = Nev;
        versenyben = true;
        sebesseg = 1;
        celbaEr = false;
        kitartas = 0;
    }

    public int getKitartas() {
        return kitartas;
    }

    public void setKitartas(int kitartas) {
        if (kitartas <= 100) {
            this.kitartas = kitartas;
        }
    }

    // True-val tér vissza, ha az állat elfáradt.
    public boolean farad(int mennyi) {
        kitartas -= mennyi;
        if (kitartas <= 0) {
            kitartas = 0;
            return true;
        }
        return false;
    }
    
    public void idotHozzaad(int reszido) {
        ido += reszido;
    }

    public abstract int ujSzakaszhozEr(TerepTipus terepTipus, int tavolsag);

    public int getIdo() {
        return ido;
    }

    public void setIdo(int ido) {
        this.ido = ido;
    }

    public int getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(int sebesseg) {
        if (sebesseg < 1) {
            sebesseg = 1;
        }
        this.sebesseg = sebesseg;
    }

    public int getHelyezes() {
        return ido;
    }

    public void setHelyezes(int helyezes) {
        this.ido = helyezes;
    }

    public String getNev() {
        return Nev;
    }

    public void setNev(String Nev) {
        this.Nev = Nev;
    }

    public boolean isVersenyben() {
        return versenyben;
    }

    public void setVersenyben(boolean versenyben) {
        this.versenyben = versenyben;
    }

    public boolean isCelbaEr() {
        return celbaEr;
    }

    public void setCelbaEr(boolean celbaEr) {
        this.celbaEr = celbaEr;
    }

    public void halad() {

    }

    public abstract String statuszSzoveg();

    @Override
    public String toString() {
        return "Allat{" + "Nev=" + Nev + ", versenyben=" + versenyben + ", celbaEr=" + celbaEr + ", sebesseg=" + sebesseg + ", ido=" + ido + '}';
    }

}
