package EstruturaDeDadosEmJava;

//Conjuntos
/*
Uma das características dos conjuntos é a não aceitação de elementos repetidos.
*/
public class Programa64 {

    public static void main(String[] args) {

      Conjunto conjunto = new Conjunto();

      System.out.println(conjunto);

      conjunto.adiciona("Ana");

      System.out.println(conjunto);

      conjunto.adiciona("Angelina");
      conjunto.adiciona("Matheus");
      conjunto.adiciona("Diana");
      conjunto.adiciona("Lara");
      conjunto.adiciona("Lara");

      conjunto.remove("Antonio");

      System.out.println(conjunto);



    }
}
