package exF;

public  abstract class Vehicule {

    protected String nom;
    protected String type_carburant ;

    public Vehicule(String nom, String type_carburant) {
        this.nom = nom;
        this.type_carburant = type_carburant;
    }

    public abstract void demarrer();
    public abstract void arreter();

    public String getNom() {
        return nom;
    }
    public String getType_carburant() {
        return type_carburant;
    }

    public void afficherInfos(){
        System.out.println(" nom : " + nom+ " type de carburant " + type_carburant);
    }
}