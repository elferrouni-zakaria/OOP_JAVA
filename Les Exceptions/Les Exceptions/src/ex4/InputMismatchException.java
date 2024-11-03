package ex4;
import java.util.Scanner;

public class InputMismatchException  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float nombre;
        System.out.println("entrer un nbr  float : ");

        try{
            nombre = scanner.nextFloat();
            System.out.println("Vous avez entre : " + nombre);
        }catch(java.util.InputMismatchException e) {
            System.out.println("Erreur :  entrer un nombre valide !");
        }

    }
}