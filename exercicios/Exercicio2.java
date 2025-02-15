package exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3, soma;

        System.out.print("Informe o valor 1: ");
        num1 = Integer.parseInt(teclado.nextLine());

        System.out.print("Informe o valor 2: ");
        num2 = Integer.parseInt(teclado.nextLine());

        System.out.print("Informe o valor 3: ");
        num3 = Integer.parseInt(teclado.nextLine());

        soma = num1 + num2 + num3;
        System.out.println("A soma de " + num1 + " com " + num2 + " e " + num3 + " é: " + soma);


        teclado.close();

    }

}
