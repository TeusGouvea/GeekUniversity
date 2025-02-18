package exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Informe um número inteiro: ");
        numero = Integer.parseInt(teclado.nextLine());

        if (numero > 0){
            System.out.println("A raiz quadrada de " + numero + " é " + Math.sqrt(numero));
        } else {
            System.out.println("O número " + numero + " é inválido.");
        }

        teclado.close();

    }

}
