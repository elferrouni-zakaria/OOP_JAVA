package programme.ex2;

public class Developpeur extends Employe {

    public String langage;


    public Developpeur(String nom, int salaire, String langage) {
        super(nom, salaire);
        this.langage = langage;
    }


    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("votre langage de programmation prefere est : "+ langage);
    }


    public void afficherLangage(){
        System.out.println("votre langage de programmation prefere est : "+ langage);
    }
}
