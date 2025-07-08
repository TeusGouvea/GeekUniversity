package RecursosAvancados;

// Classes Anônimas

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Programa70 {
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

        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
