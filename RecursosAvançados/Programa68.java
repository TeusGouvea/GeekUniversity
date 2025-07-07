package RecursosAvançados;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa68 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        Consumer<String> consumidor = new ImprimeNaLinha();

        palavras.add("Matheus");
        palavras.add("Geek");
        palavras.add("Auto Arremate");
        palavras.add("Arremaq");
        palavras.add("Java");
        palavras.add("Fiasco");

        palavras.forEach(consumidor);
    }
}
