package GeometrischeFormen;
public class Kreiskegel extends Kreis {
    
    static int counter = 0;
    public double hoehe;
    
// ----------- Constructors ----------- 
    
    public Kreiskegel() {
        this.counter++;
        super.counter--;
    }
    
    public Kreiskegel(double radius, double hoehe) {
        super(radius);
        if (Check.notMinus(radius, hoehe)) { // wenn beide Werte richtig sind
            this.hoehe = hoehe;
            this.counter++; // zaehlt der counter hoch
            super.counter--; // der counter bei Kreis zaehlt runter
        }
    }
    
// ----------- Berechnungen ----------- 

    public double zeigeVolumen() {
        return (zeigeFlaeche() * hoehe) / 3;
    }

    public double zeigeOberflaeche() {
        return halbachse1 * Math.PI *
                (halbachse1 + Math.sqrt(hoehe * hoehe + halbachse1 * halbachse1));
    }
}
