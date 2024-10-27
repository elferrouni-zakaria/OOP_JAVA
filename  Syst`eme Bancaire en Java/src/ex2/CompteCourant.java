package ex2;

import ex1.CompteBancaire;


public class CompteCourant extends CompteBancaire {
    /***********************************question4******************************/

    private double decouvertAutorise;

    // Constructeur avec découvert autorisé
    public CompteCourant(String numeroCompte, String titulaire, double decouvertAutorise) {
        super(numeroCompte, titulaire);  // Appel du constructeur de la classe parente
        this.decouvertAutorise = decouvertAutorise;
    }


    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }


    public void setDecouvertAutorise(double decouvertAutorise) {
        this.decouvertAutorise = decouvertAutorise;
    }

    // Surcharge de la méthode retirer
    @Override
    public void retirer(double montant) {
        // Vérifie si le retrait reste dans la limite du découvert autorisé
        if (getSolde() - montant >= -decouvertAutorise) {
            super.retirer(montant);  // Appelle la méthode retirer de la classe parente
            System.out.println("Retrait réussi avec découvert autorisé.");
        } else {
            System.out.println("Retrait refusé : limite de découvert autorisée dépassée.");
        }
    }
}
