package exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int var1, var2;

        System.out.print("Informe o valor 1: ");
        var1 = Integer.parseInt(teclado.nextLine());

        System.out.print("Informe o valor 2: ");
        var2 = Integer.parseInt(teclado.nextLine());

        if (var1 > var2){
            System.out.println(var1 + " é maior que " + var2);
        } else {
            System.out.println(var1 + " é menor que " + var2);
        }


        teclado.close();
    }

}
