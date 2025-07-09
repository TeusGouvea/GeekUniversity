package RecursosAvancados;

//Method Reference
/*
Podem ser consideradas simplificações das expressões lambdas.
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Programa74 {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        palavras.add("Matheus");
        palavras.add("Geek");
        palavras.add("Auto Arremate");
        palavras.add("Arremaq");
        palavras.add("Java");
        palavras.add("Fiasco");


//        Comparator<String> compador = Comparator.comparing(new Function<String, Integer>(){
//            @Override
//            public Integer apply(String s) {
//                return s.length();
//            }
//        });

//        palavras.sort(Comparator.comparing(s-> s.length()));

        //Method Reference - Forma 1
//        palavras.sort(Comparator.comparing(String::length));

        //Method Reference - Forma 2
//        Function<String,Integer> tamanho = String::length; //Usando Method References
        Function<String,Integer> tamanho = s -> s.length(); //Usando expressão lambda
        Comparator<String> comparador = Comparator.comparing(tamanho);
        palavras.sort(comparador);

//        System.out.println(palavras);

        palavras.forEach(System.out::println); //Method references
    }
}
