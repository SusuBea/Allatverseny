
package modell;


public class Allat {
        private String Nev;
        private boolean versenyben;

    public Allat(String Nev) {
        this.Nev = Nev;
        versenyben = true;
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

    @Override
    public String toString() {
        return "Allat{" + "Nev=" + Nev + ", versenyben=" + versenyben + '}';
    }



    
    
          
}
