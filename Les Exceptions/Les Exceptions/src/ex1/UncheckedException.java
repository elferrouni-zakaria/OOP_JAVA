package ex1;




public class UncheckedException {
    public static void main(String[] args){
        int var1 =5 ;
        int var2 = 0 ;
        try{
            int division = var1/var2;
        }catch (ArithmeticException e){
            System.out.println("Erreur : Division par zéro !");
        }finally {
            System.out.println("le programme se termine correctement");
        }
    }
}