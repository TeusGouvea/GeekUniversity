package RecursosAvancados;

// Lambdas
/*
Expressões lambdas, são funções anônimas, ou seja funções sem nome.

Já sabemos que podemos utilizar expressões lambdas com interfaces funcionais.

Devemos então criar uma função lambdacompatível com a função da interface que estivermos util
*/
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa73 {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        palavras.add("Matheus");
        palavras.add("Geek");
        palavras.add("Auto Arremate");
        palavras.add("Arremaq");
        palavras.add("Java");
        palavras.add("Fiasco");

        palavras.sort((s1, s2) -> Integer.compare(s1.length(),s2.length()));

        palavras.forEach(s -> System.out.println(s));

        Consumer<String> consumer = s -> System.out.println(s);
        palavras.forEach(consumer);
    }
}
