package programme.ex2;

public class Main {
    public static void main(String[] args) {
        Employe[] tableauPloy={new Developpeur("zakaria",10000,"java"),new Manager("amine",5000,2)};



       for (int i = 0; i < tableauPloy.length; i++) {
            tableauPloy[i].afficherInfos();
        }




        Employe emp1 = new Developpeur("zakaria", 6000, "php");
        emp1.afficherInfos();


        System.out.println("------------------");



        // Downcasting : Vérifier le type réel avec instanceof avant le sous-casting
        if (emp1 instanceof Developpeur) {
            ((Developpeur) emp1).afficherLangage();
        }

        Employe emp2 = new Manager("amine", 8000, 10);
        if (emp2 instanceof Manager) {
            ((Manager) emp2).gererEquipe();
        }





    }
}
