package exF;

public class Hydravion extends Vehicule implements Volant,Flottant{

    public Hydravion(String nom, String type_carburant) {
        super(nom, type_carburant);
    }

    @Override
    public void demarrer() {
        System.out.println(" hydravion " + nom + " est demarrer");
    }

    @Override
    public void arreter() {
        System.out.println(" hydravion " + nom + " est arreter");
    }

    @Override
    public void voler() {
        System.out.println(" hydravion " + nom + " est vole");
    }

    @Override
    public void flotter() {
        System.out.println(" hydravion " + nom + " est flotte");
    }
}