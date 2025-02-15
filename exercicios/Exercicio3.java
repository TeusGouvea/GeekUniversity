package exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

       float real, quadrado;

        System.out.print("Informe um valor real: ");
        real = Float.parseFloat(teclado.nextLine());

        quadrado = real * real;
        System.out.println("O quadrado de " + real + " é " + quadrado);

        teclado.close();

    }

}
