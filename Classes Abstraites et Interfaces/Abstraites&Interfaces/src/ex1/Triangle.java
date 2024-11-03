package ex1;

public  class Triangle extends Forme {
    private double a;
    private double b;
    private double c;
    private double hauteur;

    public Triangle(double a, double b, double c, double hauteur) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.hauteur = hauteur;
    }


    public double surface() {
        return 1.0/2.0 * a * hauteur;
    }


    public double perimetre() {
        return a + b + c;
    }
}