
package modell;


public class Allat {
        private String Nev;
        private boolean versenyben;
        int sebesseg;
        int helyezes;

    public int getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(int sebesseg) {
        this.sebesseg = sebesseg;
    }

    public int getHelyezes() {
        return helyezes;
    }

    public void setHelyezes(int helyezes) {
        this.helyezes = helyezes;
    }

    public Allat(String Nev) {
        this.Nev = Nev;
        versenyben = true;
        sebesseg = 100;
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
        return "Allat{" + "Nev=" + Nev + ", versenyben=" + versenyben + ", sebesseg=" + sebesseg + ", helyezes=" + helyezes + '}';
    }

    



    
    
          
}
