package ex2;


public class ProduitAlimentaire  implements  Produit{

    private String nom_produitA;
    private double prix_produitA;
    private int quantite_produitA;

    public ProduitAlimentaire(String nom_produitA, double prix_produitA, int quantite_produitA) {
        this.nom_produitA = nom_produitA;
        this.prix_produitA = prix_produitA;
        this.quantite_produitA = quantite_produitA;
    }

    @Override
    public double getPrix() {
        return prix_produitA;
    }

    @Override
    public int getQuantite() {
        return quantite_produitA;
    }

    @Override
    public double calculer_stocke() {
        return prix_produitA * quantite_produitA;
    }


}