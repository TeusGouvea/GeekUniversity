package exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Informe um número inteiro: ");
        numero = Integer.parseInt(teclado.nextLine());

        if (numero % 2 == 0){
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        teclado.close();

    }

}
