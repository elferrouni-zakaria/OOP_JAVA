package ex5;

public class Main {
    public static  void main(String[] args){
        Compte c1 = new Compte("zakaria" ,50 );

        try{
            c1.retirer(-30);
        }catch(MontantNegatifException e){
            System.out.println(e.getMessage());
        }
    }
}