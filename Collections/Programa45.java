package Collections;
/*Listas
- Aceitam repetição de valores;
- Possuem tamanho 'infinito' (Depende da memória).
- Podemos adicionar valores de qualquer tipo, desde que não especificamos um tipo na declaração.

*/
/*
Arrays (Vetores/Matrizes)
- Um array tem tamanho fixo. Ou seja se criarmos um array com 5 elementos, ele terá sempre no máximo 5 elementos.

- Um array tem tipo de dado fixo. Ou sej, se criamos um array de inteiros ele só poderá ter inteiros.

- É dificil encontrar um determinado elemento em um array. Precisamos para isso varrer todo o array
 através do seu índice, caso não façamos busca pelo índice.
*/

import java.util.ArrayList;
import java.util.Collections;

/*
Collections(coleções)
- Java possui diversas classes/interfaces que facilitam muito o trabalho quando se trata de coleções de dados. Essas classes/interfaces
são chamadas de collections (Coleções)
*/
public class Programa45 {

    public static void main(String[] args) {
//        ArrayList nomes = new ArrayList<>(); //Sem definir tipo de dado, podemos colocar qualquer tipo
        ArrayList<String> nomes = new ArrayList<String>(); //Definimos o tipo String.

        nomes.add("Maria");
        nomes.add("Angelina");
        nomes.add("Bruna");
        nomes.add("Matheus");
        nomes.add("Marcos");
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Kratos");
        nomes.add("Gustavo");

//        nomes.add(44);
//        nomes.add(true);
//        nomes.add(12.4);
//        nomes.add('e');
//
//        System.out.println(nomes.get(4));
//        System.out.println(nomes.get(2));
//
//        System.out.println(nomes.size());
//
//        for(int i = 0; i < nomes.size(); i++){
//            System.out.println(nomes.get(i));
//        }

        Collections.sort(nomes);

        for (Object nome : nomes){
            System.out.println(nome);
        }
    }
}
