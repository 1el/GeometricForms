package GeometrischeFormen;
public class RotationsEllipsoid extends TriaxialesEllipsoid {
    
    static int counter = 0;
    
// ----------- Constructors ----------- 
    
    public RotationsEllipsoid() {
        this.counter++;
        super.counter--;
    }

    public RotationsEllipsoid(double halbachse1, double halbachse2) {
        super(halbachse1, halbachse1, halbachse2);
        if (Check.notMinus(halbachse1, halbachse2)) {
            this.counter++;
            super.counter--;
        }
    }
}
