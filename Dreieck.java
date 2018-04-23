package GeometrischeFormen;
public class Dreieck extends Formen {

    static int counter = 0;
    private double seite1;
    private double seite2;
    private double seite3;

// -------------- Constructors ------------------- 
    
    public Dreieck() {
        this.counter++;
    }

    public Dreieck(double a, double b, double c) {
        if (Check.notMinus(a, b, c)) {
            if (Check.triangle(a, b, c)) {
                seite1 = a;
                seite2 = b;
                seite3 = c;
                this.counter++;
            }
        }
    }
    
// ----------- Setters & Getters ------------------- 
    
    public void setLaenge(double a, double b, double c) {
        if (Check.notMinus(a, b, c)) {
            if (Check.triangle(a, b, c)) {
                seite1 = a;
                seite2 = b;
                seite3 = c;
            }
        }
    }
    
    public double getSeite1() {
        return this.seite1;
    }
    
    public double getSeite2() {
        return this.seite2;
    }
    
    public double getSeite3() {
        return this.seite3;
    }
    
// ----------- Berechnungen ------------------- 

    public double zeigeFlaeche() {
        return (Math.sqrt((seite1 + seite2 + seite3)
                * (seite1 + seite2 - seite3) * (seite2 + seite3 - seite1)
                * (seite3 + seite1 - seite2))) / 4;
    }

    public double zeigeUmfang() {
        return seite1 + seite2 + seite3;
    }
}
