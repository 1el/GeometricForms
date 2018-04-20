package GeometrischeFormen;
public class FormenErzeugen {
    public static void main(String[] args) {
        
        Rechteck q1 = new Rechteck(5);
        q1.setLaenge(8);
        q1.setBreite(1);
        System.out.println(q1.getLaenge() * q1.getBreite());
        System.out.println("Quadrat 5 hat die Flaeche: " + q1.zeigeFlaeche() + " m2");
        System.out.println("und den Umfang: " + q1.zeigeUmfang() + " m\n");
        
        Quadrat q2 = new Quadrat(4);
        System.out.println("Quadrat q2 hat die Seitenlaenge: " + q2.getLaenge() + " m\n");
        
        Rechteck r1 = new Rechteck(6, 4);
        System.out.println("Rechteck 6-4 hat die Flaeche: " + r1.zeigeFlaeche() + " m2");
        System.out.println("und den Umfang: " + r1.zeigeUmfang() + " m\n");
        
        Dreieck d1 = new Dreieck(4, 5, 3);
        System.out.println("Dreieck 4-5-3 hat die Flaeche: " + d1.zeigeFlaeche() + " m2");
        System.out.println("und den Umfang: " + d1.zeigeUmfang() + " m\n");
        
        Kreis k1 = new Kreis(8);
        System.out.println("Kreis 8 hat die Flaeche: " + k1.zeigeFlaeche() + " m2");
        System.out.println("und den  Umfang: " + k1.zeigeUmfang() + " m\n");

        Ellipse e1 = new Ellipse(2, 3);
        System.out.println("Ellipse 2-3 hat die Flaeche: " + e1.zeigeFlaeche() + " m2");
        System.out.println("und den Umfang: " + e1.zeigeUmfang() + " m\n");
        
        Wuerfel w1 = new Wuerfel(3);
        System.out.println("Wuerfel 3 hat die Oberflaeche: " + w1.zeigeOberflaeche() + " m2");
        System.out.println("und das Volumen: " + w1.zeigeVolumen() + " m3\n");
        
        Kugel ku1 = new Kugel(7);
        System.out.println("Kugel 7 hat das Volumen: " + ku1.zeigeVolumen() + " m3");
        System.out.println("und das Volumen: " + ku1.zeigeOberflaeche() + " m3\n");
        
        Quader qu1 = new Quader(2, 3, 5);
        System.out.println("Quader 2-3-5 hat die Oberflaeche: " + qu1.zeigeOberflaeche() + " m2");
        System.out.println("und das Volumen: " + qu1.zeigeVolumen() + " m3\n");
        
        Zylinder z1 = new Zylinder(4, 10);
        System.out.println("Zylinder 4-10 hat die Oberflaeche: " + z1.zeigeOberflaeche() + " m2");
        System.out.println("und das Volumen: " + z1.zeigeVolumen() + " m3\n");
        
        Kreiskegel kr1 = new Kreiskegel(4, 6);
        System.out.println("Kreiskegel 4-6 hat die Oberflaeche: " + kr1.zeigeOberflaeche() + " m2");
        System.out.println("und das Volumen: " + kr1.zeigeVolumen() + " m3\n");
        
        RotationsEllipsoid re1 = new RotationsEllipsoid(3, 4);
        System.out.println("Rotationsellipsoid 3-4 hat das Volumen: " + re1.zeigeVolumen() + " m3\n");
        
        TriaxialesEllipsoid t1 = new TriaxialesEllipsoid(3, 3.5, 2.5);
        System.out.println("Triaxiales Ellipsoid 3-3,5-2,5 hat das Volumen: " + t1.zeigeVolumen() + " m3\n");
        
        System.out.println("Formen counter automatisch: " + Formen.counter);
        System.out.println("Formen counter die Summe alle Formen-Counters: " + summe());
        
        Dreieck x = new Dreieck(10, 5, 3); // erzeugt kein Objekt, weil die Werte unmöglich sind
        
        System.out.println("Formen counter: " + Formen.counter); // der counter bei der Superclasse Formen zaehlt aber hoch.
        
        Kreis y = new Kreis(-2); // erzeugt ein Kreis, aber keine Ellipse, weil nur bei der Superclasse Ellipse die Eingabe geprueft wird
        

        System.out.println("\nCounters:");
        System.out.println("Kreise    \t\t" + Kreis.counter); 
        System.out.println("Rechtecke \t\t" + Rechteck.counter); 
        System.out.println("Quadrate \t\t" + Quadrat.counter); 
        System.out.println("Ellipse \t\t" + Ellipse.counter);
        System.out.println("Quader    \t\t" + Quader.counter);
        System.out.println("Wuerfel \t\t" + Wuerfel.counter);
        System.out.println("Kugel    \t\t" + Kugel.counter);
        System.out.println("Kreiskegel \t\t" + Kreiskegel.counter);
        System.out.println("Zylinder \t\t" + Zylinder.counter);
        System.out.println("Dreicke \t\t" + Dreieck.counter);
        System.out.println("RotationsEllipsoide \t" + RotationsEllipsoid.counter);
        System.out.println("TriaxialesEllipsoide \t" + TriaxialesEllipsoid.counter);
        
        System.out.println("\nFormen counter - automatic: " + Formen.counter);
        System.out.println("Formen counter - Summe alle Formen: " + summe());

    }
    
    private static int summe() {
        return Ellipse.counter + Kreis.counter + Kugel.counter
                + RotationsEllipsoid.counter + TriaxialesEllipsoid.counter
                + Zylinder.counter + Kreiskegel.counter + Rechteck.counter
                + Quadrat.counter + Quader.counter + Wuerfel.counter
                + Dreieck.counter;
    }
}
