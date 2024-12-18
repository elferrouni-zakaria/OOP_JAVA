package com.company.exCours;

import java.util.HashSet;

public class Ex4 {
    public static void main(String[] args) {


        HashSet<Integer> numeros = new HashSet<Integer>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        boolean ajouté = numeros.add(20);

        int cherche = 30;
        if (numeros.contains(cherche)) {
            System.out.println(cherche + " est présent dans l'ensemble.");
        } else {
            System.out.println(cherche + " n'est pas présent dans l'ensemble.");
        }
        for (int numero : numeros) {
            System.out.println(numero); }
    }
}
