package RecursosAvancados;

//Classes Anônimas
/*
Classes anônimas são classes sem nome.
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Programa69 {

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

        Consumer<String> consumidor = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        palavras.forEach(consumidor);
    }
}
