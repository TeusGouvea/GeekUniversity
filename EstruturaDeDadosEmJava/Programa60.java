package EstruturaDeDadosEmJava;

//Pilhas
/*
São estruturas de dados onde o elemento que está visível/disponível é o que está sempre no topo.

Os elementos, ao serem adicionados em uma pilha, são adicionados sempre no topo.

Para remover elementos da pilha, só podemos removero topo.

O último elemento a entrar é o primeiro a sair.
*/

public class Programa60 {

    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        System.out.println(pilha);

        pilha.insere("Matheus");
        System.out.println(pilha);

        pilha.insere("Casemiro");
        System.out.println(pilha);

        String ret = pilha.pegaTopo();
        System.out.println(ret);

        String r1 = pilha.remove();
        System.out.println(r1);

        System.out.println(pilha);

        pilha.remove();
        System.out.println(pilha.empty());

    }
}
