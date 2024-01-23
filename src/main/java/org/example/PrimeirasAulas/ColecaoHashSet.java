package org.example.PrimeirasAulas;

import java.util.Set;
import java.util.HashSet;

public class ColecaoHashSet {

    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(3);
        numeros.add(5);
        numeros.add(89);
        numeros.add(89);

        for (Integer elemento : numeros){
            System.out.println(elemento);
        }



    }
}
