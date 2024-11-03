package ex1;

public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }



    public double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }


    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
}