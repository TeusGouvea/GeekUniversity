package EstruturaDeDadosEmJava;

//Implementação de conjuntos do Java

import java.util.HashSet;
import java.util.Set;

public class Programa65 {

    public static void main(String[] args) {
        Set<String> nomes = new HashSet<String>();

        System.out.println(nomes);

        nomes.add("João");
        nomes.add("Matheus");
        nomes.add("Diana");

        System.out.println(nomes);

        String nome1 = "João";
        String nome2 = "Matheus";
        String nome3 = "Diana";

        System.out.println(nome1.hashCode());
        System.out.println(nome2.hashCode());
        System.out.println(nome3.hashCode());
        System.out.println("Matheus".hashCode());

    }
}
