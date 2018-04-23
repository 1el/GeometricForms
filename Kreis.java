package GeometrischeFormen;
public class Kreis extends Ellipse {
    
    static int counter = 0;

    // ----------- Constructors ----------- 
    
    public Kreis() {
        this.counter++;
        super.counter--;
    }
    
    public Kreis(double radius) {
        super(radius, radius);
        if (Check.notMinus(radius)) {
            this.counter++;
            super.counter--;
        }
    }
}
