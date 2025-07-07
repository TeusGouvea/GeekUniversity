package RecursosAvançados;

//Default Methods
/*
Default Methods -> São métodos concretos implementados em uma interface. Estes métodos,como são concretos, ou seja, já possuem implementação,
não precisam ser implementados pelas classes que implementam esta interface.
Novidade implementada a partir da versão 8 do Java
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa66 {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparador = new ComparadorPorTamanho();

        palavras.add("Matheus");
        palavras.add("Geek");
        palavras.add("Auto Arremate");
        palavras.add("Arremaq");
        palavras.add("Java");
        palavras.add("Fiasco");

//        Collections.sort(palavras, comparador);

        palavras.sort(comparador);

//        for (int i = 0; i < palavras.size(); i++){
//            System.out.println("A palavra " + palavras.get(i) + " tem tamanho " + palavras.get(i).length());
//        }

        System.out.println(palavras);
    }
}
