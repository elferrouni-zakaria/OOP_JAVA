package programme.ex2;

public class Manager extends Employe{
    public int nombreDeSubordonnes;



    public Manager(String nom, int salaire, int nombreDeSubordonnes) {
        super(nom, salaire);
        this.nombreDeSubordonnes = nombreDeSubordonnes;
    }

    public void afficherInfos(){
        super.afficherInfos();
        System.out.println("le nombre de subordonnes est : "+ nombreDeSubordonnes);
    }

    public void gererEquipe(){
        System.out.println("methode gerer Equipe");
    }



}
