package ex1;

public class CompteBancaire {

    /***********************************question1******************************/
    private String numeroCompte;
    private double solde;
    private String titulaire;

    public CompteBancaire(){
        this.numeroCompte="";
        this.solde=0;
        this.titulaire="";
    }

    public double deposer(double montant){
        solde=solde+montant;
        return solde;
    }

    public void retirer(double montant){

        if (solde > montant && solde == montant){
            solde=solde-montant;
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
}
