package GeometrischeFormen;
public class TriaxialesEllipsoid extends Ellipse {
    
    static int counter = 0;
    protected double halbachse3;
    
// ----------- Constructors ----------- 
    
    public TriaxialesEllipsoid() {
        this.counter++;
        super.counter--;
    }

    public TriaxialesEllipsoid(double halbachse1, double halbachse2, double halbachse3) {
        super(halbachse1, halbachse2);
        if (Check.notMinus(halbachse1, halbachse2, halbachse3)) {
            this.halbachse3 = halbachse3;
            this.counter++;
            super.counter--;
        }
    }
    
// ----------- Berechnungen ----------- 
    
    public double zeigeVolumen() {
        return (4 * Math.PI * halbachse1 * halbachse2 * halbachse3) / 3;
    }
}
