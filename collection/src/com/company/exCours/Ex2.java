package com.company.exCours;

import java.util.Iterator;
import java.util.Vector;


public class Ex2 {
    public static void main(String[] args) {

        Vector<Integer> collectionvec = new Vector<Integer>();

        for(int i=1; i <= 10; i++) {
            collectionvec.add(i);
            System.out.println("Capacité  " + collectionvec.capacity());
        }

        Iterator<Integer> it = collectionvec.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        collectionvec.set(4, 99);
        System.out.println("Après remplacement du 5ème élément : "+ collectionvec);

    }
}
