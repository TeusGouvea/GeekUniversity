package RecursosAvancados;

//Lambdas
/*
Expressões lambdas, sãofunções anônimas.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa71 {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparador = new ComparadorPorTamanho();

        palavras.add("Matheus");
        palavras.add("Geek");
        palavras.add("Auto Arremate");
        palavras.add("Arremaq");
        palavras.add("Java");
        palavras.add("Fiasco");

        palavras.sort(comparador);

        //Expressão lambda-forma 1
//        palavras.forEach((String s) ->{
//            System.out.println(s);
//        });

        //Expressão lambda-forma 2
        palavras.forEach(s ->
            System.out.println(s)
        );
    }
}
