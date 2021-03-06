package GeometrischeFormen;;
public class Ellipse extends Formen {
    
    static int counter = 0;
    protected double halbachse1;
    protected double halbachse2;
    
// ---------------------- Constructors ----------------------
    
    public Ellipse() {
        this.counter++;
    }
    
    public Ellipse(double halbachse1, double halbachse2) {
        if (Check.notMinus(halbachse1, halbachse2)) {
        this.halbachse1 = halbachse1;
        this.halbachse2 = halbachse2;
        this.counter++;
        }
    }
    
    public Ellipse(double halbachse) {
        if (Check.notMinus(halbachse)) {
        this.halbachse1 = halbachse;
        this.halbachse2 = halbachse;
        System.out.println("Das ist ein Kreis!");
        Kreis.counter++;
        }
    }
    
// --------------------- Setters & Getters -------------------
    
    public void setHalbachse1(double a) {
        if (Check.notMinus(a)) {
            this.halbachse1 = a;
        }
    }
    
    public double getHalbachse1() {
        return this.halbachse1;
    }
    
    public void setHalbachse2(double a) {
        if (Check.notMinus(a)) {
            this.halbachse2 = a;
        }
    }
    
    public double getHalbachse2() {
        return this.halbachse2;
    }  
    
// -------------------- Berechnungen --------------------------
    
    public double zeigeFlaeche() {
        return java.lang.Math.PI * halbachse1 * halbachse2;
    }
    
    public double zeigeUmfang() {
        return java.lang.Math.PI * (halbachse1 + halbachse2);
    }
}
