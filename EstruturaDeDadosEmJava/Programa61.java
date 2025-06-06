package EstruturaDeDadosEmJava;

//Pilhas - Implementação do Java

import java.util.Stack;

public class Programa61 {

    public static void main(String[] args) {
        Stack<String> nomes = new Stack<String>();

        nomes.push("Matheus"); //Insere
        nomes.push("Carlos");
        System.out.println(nomes);

        String ret = nomes.peek(); //Retorna o elemento do topo
        System.out.println(ret);
        System.out.println(nomes);

        String r1 = nomes.pop(); //remove
        System.out.println(r1);
        System.out.println(nomes);


    }
}
