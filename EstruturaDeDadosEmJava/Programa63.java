package EstruturaDeDadosEmJava;

//Fila -> Implementação do Java

import java.util.LinkedList;
import java.util.Queue;

public class Programa63 {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();

        System.out.println(fila);

        fila.add("Matheus");
        fila.add("Angelina");
        fila.add("Carol");

        System.out.println(fila);

        String ret = fila.poll(); //remover
        System.out.println(ret);

        System.out.println(fila);
    }
}
