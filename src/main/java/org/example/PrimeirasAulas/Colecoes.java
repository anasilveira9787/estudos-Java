package org.example.PrimeirasAulas;

import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {

        Map<String, Integer> notasPorAluno = new HashMap<>();
        notasPorAluno.put("Ana", 10);
        notasPorAluno.put("Lucas", 0);

        for (Map.Entry<String, Integer> entry : notasPorAluno.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key);
            System.out.println(value);
        }

    }
}
