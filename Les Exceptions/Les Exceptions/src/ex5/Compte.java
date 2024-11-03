package ex5;

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

    public void retirer(double montant ) throws MontantNegatifException
    {
        if (montant > solde && montant < 0)
        {
            throw new MontantNegatifException(" Erreur : Le montant a retirer ne peut pas etre negatif ");
        }else{
            solde -= montant;
        }
    }



    public void verser(double montant ) throws MontantNegatifException
    {
        if (montant  <  0 ){
            throw new MontantNegatifException(" Erreur : Le montant a verse ne peut pas etre negatif ");
        }else{
            solde += montant;
        }
    }




}