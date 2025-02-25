package Estruturarepeticao;

import java.util.Scanner;

public class Programa9 {

    public static void main(String[] args) {

        int idade;

        String nome;

        Scanner teclado = new Scanner(System.in);

        //Variável de controle; condição de parada; forma de incremento
        for (int i = 0; i < 5; i++) {

            System.out.print("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.print("Informe sua idade: ");
            idade = Integer.parseInt(teclado.nextLine());

            if (idade > 0) {
                System.out.println(nome + " tem " + idade + " anos");
            }

        }

        teclado.close();

    }

}
