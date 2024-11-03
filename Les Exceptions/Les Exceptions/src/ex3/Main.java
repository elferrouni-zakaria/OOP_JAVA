package ex3;

public class Main {

        public static void main(String[] args) {

            Compte cp = new Compte("zakaria", 100);

            try {
                cp.retirer(300);
            } catch (SoldeInsuffisantException e) {
                System.out.println("eror : " + e.getMessage());
            }
        }
    }