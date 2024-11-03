package ex3;
public class Compte
{
    private String nom;
    private double solde;

    public Compte(String nom ,  double solde ){
        this.nom=nom;
        this.solde=solde;
    }

    public String getNom() {
        return nom;
    }

    public double getSolde() {
        return solde;
    }

    public void retirer(double montant ) throws SoldeInsuffisantException
    {
        if (montant > solde)
        {
            throw new SoldeInsuffisantException(" solde insuffisant ! ");
        }else{
            solde -= montant;
        }
    }
}