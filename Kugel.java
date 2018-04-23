package GeometrischeFormen;
public class Kugel extends TriaxialesEllipsoid {
    
    static int counter = 0;
    
// ----------- Constructors ----------- 

    public Kugel() {
        this.counter++;
        super.counter--;
    }
    
    public Kugel(double halbachse) {
        super(halbachse, halbachse, halbachse);
        if (Check.notMinus(halbachse)) {
            this.counter++;
            super.counter--;
        }
    }
    
// ----------- Berechnungen ----------- 
    
    public double zeigeOberflaeche() {
        return 4 * Math.PI * halbachse1 * halbachse1;
    }
}
