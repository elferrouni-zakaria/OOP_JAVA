package ex2;

import ex1.CompteBancaire;


public class CompteEpargne extends CompteBancaire {

    /***********************************question5******************************/
    private double tauxInteret;

    // Constructeur avec taux d'intérêt
    public CompteEpargne(String numeroCompte, String titulaire, double tauxInteret) {
        super(numeroCompte, titulaire);  // Appel du constructeur de la classe parente
        this.tauxInteret = tauxInteret;
    }


    public double getTauxInteret() {
        return tauxInteret;
    }


    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    // Méthode pour calculer les intérêts et les ajouter au solde
    public void calculerInteret() {
        double interet = getSolde() * tauxInteret / 100;
        deposer(interet);  // Ajoute les intérêts au solde
        System.out.println("Intérêts ajoutés : " + interet);
    }
}
