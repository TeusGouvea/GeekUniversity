package Collections;

//Mapas / Map
/*
Os mapas são representados em Java pela interface do Map e mapeia seus elementos utilizando o conceito de chave/valor.

Mapas são conhecidos como se fossem/representassem 3 coleções.
  - Coleção de chaves;
  - Coleção de valores;
  - Coleção de associações;
*/

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Programa50 {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21,"Felicity Jones");
        pessoas.put(31,"Maria Antonieta");
        pessoas.put(41,"Angelina Jolie");

        //Coleção de chaves
        System.out.println("Chaves: " + pessoas.keySet());

        //Coleção de valores
        System.out.println("Valores: " + pessoas.values());

        //Coleção de associações
        System.out.println("Associação: " + pessoas.entrySet());



        //Iterar na coleção de chaves

        //Forma 1
        //Disponibilizado a partir do Java 8
        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });

        //Forma 2
        Set<Integer> chaves = pessoas.keySet();
        for (Integer idade: chaves){
            System.out.println(pessoas.get(idade));
        }

        //Iterar na coleção de valores

        //Forma1
        Collection<String> valores = pessoas.values();
        for (String nome : valores){
            System.out.println(nome);
        }

        //Forma 2
        pessoas.values().forEach(nome -> {
            System.out.println(nome);
        });

        //Itera a coleção de associações

        //Forma 1
        Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
        for (Entry<Integer, String> associacao: associacoes){
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }

        //Forma 2
        pessoas.entrySet().forEach(associacao -> {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        });
    }
}
