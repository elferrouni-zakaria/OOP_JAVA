package exF;

public class Main {
    public static void main(String[] args){

        Vehicule[] vehicules = new Vehicule[3] ;

        vehicules[0] =new Voiture("dacia", "essence");
        vehicules[1]=new Bateau("bateau1", "carb1");
        vehicules[2]=new Hydravion("hydravion2", "carb2");

        for(Vehicule v : vehicules){
            v.demarrer();
            v.arreter();
        }

        Bateau bt1 = new Bateau("bt434","crb12345");
        Voiture car1 = new Voiture("kia","disele");
        if ( bt1 instanceof  Flottant){
            ((Flottant) bt1).flotter();
        }
        if ( car1 instanceof  Roulant){
            ((Roulant) car1).rouler();
        }




    }
}