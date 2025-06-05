package EstruturaDeDadosEmJava;

//Lista duplamente ligada

public class Programa59 {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        System.out.println(lista);

        lista.adiciona("Pedro");
        System.out.println(lista);

        lista.adiciona("Augusto");
        System.out.println(lista);

        lista.adiciona("Antonio");
        System.out.println(lista);

//        lista.remove(1);
//        System.out.println(lista);

        System.out.println(lista.contem("Pedro"));
    }
}
