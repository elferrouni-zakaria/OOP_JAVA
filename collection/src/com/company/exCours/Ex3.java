package com.company.exCours;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex3 {
    public static void main(String[] args) {

        ArrayList<String> couleurs = new ArrayList<String>();
        couleurs.add("blanc");
        couleurs.add("noire");
        couleurs.add("orange");
        couleurs.add("vert");

        Iterator<String> iterator = couleurs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ListIterator<String> listIterator = couleurs.listIterator(couleurs.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        listIterator = couleurs.listIterator(2);
        listIterator.add("Noir");


    }
}
