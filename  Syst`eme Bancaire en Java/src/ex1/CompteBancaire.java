package ex1;
import ex3.Transaction;
import java.util.ArrayList;

public class CompteBancaire {

    /***********************************question1******************************/
    /*
    private String numeroCompte;
    private String titulaire;
    private double solde;


    public CompteBancaire(){
        this.numeroCompte="";
        this.titulaire="";
        this.solde=0;
    }

    public CompteBancaire(String numeroCompte, String titulaire) {
        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
        this.solde =0;
    }

    public CompteBancaire(String numeroCompte, String titulaire,double solde) {
        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
        this.solde =solde;
    }

    public double deposer(double montant){
        solde+=montant;
        return solde;
    }

    public void retirer(double montant){

        if (solde > montant || solde == montant){
            solde-=montant;
            System.out.println("le reste de solde est : " + solde);
        }
        else{
            System.out.println("Solde est insuffisant ");
        }
    }

    public void afficherSolde(){
        System.out.println("le solde acctuele du compte est : "+ solde);
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

     */



    /***********************************question8******************************/
    private String numeroCompte;
    private String titulaire;
    private double solde;
    private ArrayList<Transaction> historiqueTransactions;

    public CompteBancaire(String numeroCompte, String titulaire) {
        this.numeroCompte = numeroCompte;
        this.titulaire = titulaire;
        this.solde = 0;
        this.historiqueTransactions = new ArrayList<>();
    }

    public double deposer(double montant) {
        solde += montant;
        historiqueTransactions.add(new Transaction("crédit", montant)); // Enregistrer la transaction
        return solde;
    }

    public void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
            historiqueTransactions.add(new Transaction("débit", montant)); // Enregistrer la transaction
            System.out.println("le reste de solde est : " + solde);
        } else {
            System.out.println("Solde est insuffisant");
        }
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void afficherSolde(){
        System.out.println("le solde acctuele du compte est : "+ solde);
    }

    public void afficherTransactions() {
        System.out.println("Historique des transactions pour le compte " + numeroCompte + ":");
        for (Transaction transaction : historiqueTransactions) {
            System.out.println(transaction);
        }
    }






}
