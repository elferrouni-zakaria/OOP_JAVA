package exF;
public class Bateau extends Vehicule implements Flottant{

    public Bateau(String nom, String typeCarburant) {
        super(nom, typeCarburant);
    }
    public void arreter(){
        System.out.println(" le Bateau " + nom + " est arreter");
    }
    public void demarrer(){
        System.out.println("le Bateau " + nom + "  a demarrer");
    }
    public void flotter(){
        System.out.println("le Bateau a flotter");
    }

}