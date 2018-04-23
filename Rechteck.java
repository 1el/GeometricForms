package GeometrischeFormen;
public class Rechteck extends Formen {
    
    static int counter = 0;
    protected double laenge;
    protected double breite;
    
    // ----------- Constructors ----------- 
    
    public Rechteck() {
        this.counter++;
    }
    
    public Rechteck(double laenge, double breite) {
        if (Check.notMinus(laenge, breite)) {
            this.laenge = laenge;
            this.breite = breite;
            this.counter++;
        }
    }

    public Rechteck(double laenge) {
        if (Check.notMinus(laenge)) {
            this.laenge = laenge;
            this.breite = laenge;
            System.out.println("Das ist ein Quadrat!");
            Quadrat.counter++;
        }
    }
    
    // ----------- Getters & Setters ----------- 
    
    public void setLaenge(double laenge) {
        if (Check.notMinus(laenge)) {
            this.laenge = laenge;
        }
    }
    
    public double getLaenge() {
        return laenge;
    }
    
    public void setBreite(double breite) {
        if (Check.notMinus(breite)) {
            this.breite = breite;
        }
    }
    
    public double getBreite() {
        return breite;
    }    
    
    // ----------- Berechnungen ----------- 
    
    public double zeigeFlaeche() {
        return laenge * breite;
    }
    
    public double zeigeUmfang() {
        return 2 * (laenge + breite);
    }
}
