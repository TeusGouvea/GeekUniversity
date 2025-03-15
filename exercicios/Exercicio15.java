package exercicios;

public class Exercicio15 {

    static int maior_valor(int valor1, int valor2){

        if (valor1 > valor2){
            return valor1;
        } else {
            return valor2;
        }

    }

    public static void main(String[] args) {

        System.out.println(maior_valor(57, 77));
        System.out.println(maior_valor(58, 7));
        System.out.println(maior_valor(57, 57));

    }

}
