package org.example.PrimeirasAulas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Lucas");
        nomes.add("Amora");
        nomes.add("Stella");

        nomes.forEach(nome ->
        System.out.println("O nome é " + nome));

        nomes.forEach(System.out::println);
    }
}