package GeometrischeFormen;

public class Zylinder extends Kreis {
    
    static int counter = 0;
    public double hoehe;

// ----------- Constructors ----------- 
    
    public Zylinder() {
        this.counter++;
        super.counter--;
    }

    public Zylinder(double radius, double hoehe) {
        super(radius);
        if (Check.notMinus(radius, hoehe)) {
            this.hoehe = hoehe;
            this.counter++;
            super.counter--;
        }
    }
    
// ----------- Berechnungen -----------

    public double zeigeVolumen() {
        return zeigeFlaeche() * hoehe;
    }

    public double zeigeOberflaeche() {
        return 2 * zeigeFlaeche() + 2 * Math.PI * halbachse1 * hoehe;
    }
}
