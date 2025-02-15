package exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.print("Informe um numero inteiro: ");
        numero = Integer.parseInt(teclado.nextLine());

        System.out.println("O número informado foi: " + numero);

        teclado.close();

    }
}
