package GeometrischeFormen;
public class Quadrat extends Rechteck {
    
    static int counter = 0;
    
    public Quadrat() {
        this.counter++;
        super.counter--;
    }
    
    public Quadrat(double a) {
        super(a, a);
        if (Check.notMinus(a)) {
            this.counter++;
            super.counter--;
        }
    }
}
