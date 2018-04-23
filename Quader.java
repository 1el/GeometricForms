package GeometrischeFormen;
public class Quader extends Rechteck {
    
    static int counter = 0;
    private double hoehe;
    
// ----------- Constructors ----------- 
    
    public Quader() {
        this.counter++;
        super.counter--;
    }
    
    public Quader(double laenge, double breite, double hoehe) {
        super(laenge, breite);
        if (Check.notMinus(laenge, breite, hoehe)) {
            this.hoehe = hoehe;
            this.counter++;
            super.counter--;
        }
    }
    
// ----------- Berechnungen ----------- 
    
    public double zeigeOberflaeche() {
        return (zeigeFlaeche() + hoehe * breite + hoehe * laenge) * 2;
    }
    
    public double zeigeVolumen() {
        return laenge * breite * hoehe;
    }
}
