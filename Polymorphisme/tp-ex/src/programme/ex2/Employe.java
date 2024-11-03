package programme.ex2;

public class Employe {
    public String nom;
    private int salaire;

    public Employe(String nom, int salaire) {
        this.nom=nom;
        this.salaire=salaire;
    }


    public int getSalaire(){
        return salaire;
    }
    public void setSalaire(int salaire){
        this.salaire=salaire;
    }

    public void afficherInfos(){
        System.out.println("bonjour " + nom + "votre salaire est : "+ getSalaire());
    }
}
