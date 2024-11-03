package ex2;

public class ProduitElectronique implements Produit {

    private String nom_produitE;
    private double prix_produitE;
    private int quantite_produitE;

    public ProduitElectronique(String nom_produitE, double prix_produitE, int quantite_produitE) {
        this.nom_produitE = nom_produitE;
        this.prix_produitE = prix_produitE;
        this.quantite_produitE = quantite_produitE;
    }

    @Override
    public double getPrix() {
        return prix_produitE;
    }

    @Override
    public int getQuantite() {
        return quantite_produitE;
    }

    @Override
    public double calculer_stocke() {
        return prix_produitE * quantite_produitE;
    }

}