package EstruturaDeDadosEmJava;

import ModificadoresDeAcesso.Cliente;

//Lista ligada/ LinkedList
/*
Em um vetor, os elementos estão um do lado do outro, enquanto em uma lista ligada, eles estão em lugares diferentes, porém
um aponta para o outro indicando o próximo elemento.
*/
public class Programa57 {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

//        System.out.println(lista);
//        lista.adicionaNoComeco("Maria");
//        System.out.println(lista);
//        lista.adicionaNoComeco("Angelina");
//        System.out.println(lista);
//        lista.adicionaNoComeco("Felicity");
//        System.out.println(lista);
//
//        String nome = "Pedro";
//        lista.adicionaNoComeco(nome);
//        System.out.println(lista);
//
//        int numero = 42;
//        lista.adicionaNoComeco(numero);
//        System.out.println(lista);
//
//        Cliente cli1 = new Cliente(34, "Juliana Paes", "Rua 3");
//        lista.adicionaNoComeco(cli1);
//        System.out.println(lista);

//        System.out.println(lista);
//
//        lista.adicionaNoComeco("Maria");
//        System.out.println(lista);
//
//        lista.adiciona("Pedro");
//        System.out.println(lista);
//
//        lista.adicionaNoComeco("Matheus");
//        System.out.println(lista);
//
//        lista.adiciona(1, "Carlos");
//        System.out.println(lista);
//
//        Object ret = lista.pega(1);
//        System.out.println(ret);
//
//        System.out.println(lista.tamanho());

        System.out.println(lista);

        lista.adiciona("Pedro");
        System.out.println(lista);

        lista.adiciona("Augusto");
        System.out.println(lista);

        lista.adiciona("Antonio");
        System.out.println(lista);

        lista.removeDoComeco();
        System.out.println(lista);
    }
}
