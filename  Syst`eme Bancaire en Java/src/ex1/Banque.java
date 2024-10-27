package ex1;
import java.util.ArrayList;

public class Banque {
    /***********************************question2******************************/
    ArrayList<CompteBancaire> comptes = new ArrayList<>();
    private static int nombreComptes;


    // methode ajouter Compte
    public void ajouterCompte(CompteBancaire compte){
        comptes.add(compte);
        nombreComptes++;  // Incrémenter le nombre pour le nouveau compte
    }


    // chercherCompte(
    public CompteBancaire chercherCompte(String numeroCompte){
        for (int i = 0; i < comptes.size(); i++) {
            CompteBancaire compte = comptes.get(i);
            if (compte.getNumeroCompte().equals(numeroCompte)) {
                return compte;
            }
        }
        return null;
    }

    public void transfert(String numeroSource, String numeroDest, double montant  ){
        CompteBancaire compteSource = chercherCompte(numeroSource);
        CompteBancaire compteDest = chercherCompte(numeroDest);

        if (compteSource != null && compteDest != null && montant > 0) {
            compteSource.retirer(montant);// Retirer du compte source
            compteDest.deposer(montant);     // Déposer sur le compte destination
        }
    }

    // methode statique pour afficher les comptes
    public static String afficherNombreComptes(){
        return "le nbr totale du comptes est : " + nombreComptes;
    }


}