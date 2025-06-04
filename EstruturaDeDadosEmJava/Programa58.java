package EstruturaDeDadosEmJava;

//LinkedList

import java.util.LinkedList;
import java.util.List;

public class Programa58 {

    public static void main(String[] args) {
        List<String> lista = new LinkedList<String>();

        System.out.println(lista.size());

        lista.add("Matheus");
        lista.add("Miqueline");

        lista.add(0, "Diana");

        System.out.println(lista);
    }
}
