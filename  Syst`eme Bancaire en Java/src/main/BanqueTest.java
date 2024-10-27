package main;
import ex1.*;
import ex2.*;

public class BanqueTest {
        public static void main(String[] args) {


            /***********************************question3******************************/
            /*
            // Création de la banque
            Banque banque = new Banque();

            // **Question 3**
            // Ajout de trois comptes bancaires avec des numéros et des titulaires différents
            CompteBancaire compte1 = new CompteBancaire("CB1", "Zakaria");
            CompteBancaire compte2 = new CompteBancaire("CB2", "Amine");
            CompteBancaire compte3 = new CompteBancaire("CB3", "Ahmed");

            // Ajout des comptes à la banque
            banque.ajouterCompte(compte1);
            banque.ajouterCompte(compte2);
            banque.ajouterCompte(compte3);

            // Effectuer des dépôts sur chaque compte
            compte1.deposer(1000);
            compte2.deposer(500);
            compte3.deposer(1500);

            // Effectuer des retraits
            compte1.retirer(200);
            compte2.retirer(100);

            // Effectuer un transfert de compte2 à compte3
            banque.transfert("CB2", "CB3", 300);

            // Afficher le solde des comptes après les transactions
            System.out.println("Solde des comptes après les transactions:");
            compte1.afficherSolde();
            compte2.afficherSolde();
            compte3.afficherSolde();

            // Afficher le nombre total de comptes
            System.out.println(Banque.afficherNombreComptes());

             */
            /***********************************question6******************************/
           /*
            // Création de comptes courants et comptes épargne
            CompteCourant compteCourant = new CompteCourant("CC1", "Yassine", 300);  // découvert autorisé de 300
            CompteEpargne compteEpargne = new CompteEpargne("CE1", "Sofia", 2.5);     // taux d'intérêt de 2.5%

            // Ajout des comptes à la banque
            banque.ajouterCompte(compteCourant);
            banque.ajouterCompte(compteEpargne);

            // Effectuer des dépôts
            compteCourant.deposer(700);
            compteEpargne.deposer(2000);

            // Effectuer des retraits
            compteCourant.retirer(900);   // devrait être autorisé grâce au découvert
            compteEpargne.retirer(300);

            // Calculer et appliquer les intérêts pour les comptes épargne
            compteEpargne.calculerInteret();

            // Afficher les informations des comptes après chaque opération
            System.out.println("Informations des comptes après chaque opération:");
            compteCourant.afficherSolde();
            compteEpargne.afficherSolde();

            // Afficher le nombre total de comptes
            System.out.println(Banque.afficherNombreComptes());
        }
            */



            /***********************************question9******************************/
            // Création de la banque
            Banque banque = new Banque();

            // Ajout de trois comptes bancaires
            CompteBancaire compte1 = new CompteBancaire("CB1", "Zakaria");
            CompteBancaire compte2 = new CompteBancaire("CB2", "Amine");
            CompteBancaire compte3 = new CompteBancaire("CB3", "Ahmed");

            banque.ajouterCompte(compte1);
            banque.ajouterCompte(compte2);
            banque.ajouterCompte(compte3);

            // Effectuer des dépôts sur chaque compte
            compte1.deposer(1000);
            compte2.deposer(500);
            compte3.deposer(1500);

            // Effectuer des retraits
            compte1.retirer(200);
            compte2.retirer(100);

            // Effectuer un transfert de compte2 à compte3
            banque.transfert("CB2", "CB3", 300);

            // Afficher le solde des comptes après les transactions
            System.out.println("Solde des comptes après les transactions:");
            compte1.afficherSolde();
            compte2.afficherSolde();
            compte3.afficherSolde();

            // Afficher l'historique des transactions pour chaque compte
            compte1.afficherTransactions();
            compte2.afficherTransactions();
            compte3.afficherTransactions();

            // Afficher le nombre total de comptes
            System.out.println(Banque.afficherNombreComptes());
        }

    }
