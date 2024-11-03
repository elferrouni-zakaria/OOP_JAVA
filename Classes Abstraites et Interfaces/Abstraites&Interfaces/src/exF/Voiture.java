package exF;

public class Voiture  extends Vehicule  implements Roulant {

    public Voiture(String nom, String typeCarburant) {
        super(nom, typeCarburant);
    }

    public void arreter(){
        System.out.println(" la voiture " + nom + " est arreter");
    }
    public void demarrer(){
        System.out.println("la voiture " + nom + " a demarrer");
    }
    public void rouler(){
        System.out.println("la voiture a rouler");
    }


}
