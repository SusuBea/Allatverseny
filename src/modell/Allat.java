package modell;

public class Allat {

    private String Nev;
    private boolean versenyben;
    private boolean celbaEr;
    int sebesseg;
    int ido;

    
    
    public Allat(String Nev) {
        this.Nev = Nev;
        versenyben = true;
        sebesseg = 100;
        this.ido = ido;
        celbaEr = false;
     
    }

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

    @Override
    public String toString() {
        return "Allat{" + "Nev=" + Nev + ", versenyben=" + versenyben + ", celbaEr=" + celbaEr + ", sebesseg=" + sebesseg + ", ido=" + ido + '}';
    }
    
    
    
    

}
