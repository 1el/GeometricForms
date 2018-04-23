package GeometrischeFormen;
public class Wuerfel extends Quader {
    
    static int counter = 0;
    
    // ----------- Constructors ----------- 
    
    public Wuerfel() {
        this.counter++;
        super.counter--;
    }
    
    public Wuerfel(double a) {
        super(a, a, a);
        if (Check.notMinus(a)) {
            this.counter++;
            super.counter--;
        }
    }
}
