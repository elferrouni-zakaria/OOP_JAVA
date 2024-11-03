package ex1;

public class Rectangle extends Forme {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }


    public double surface() {
        return longueur * largeur;
    }


    public double perimetre() {
        return 2 * (longueur + largeur);
    }
}