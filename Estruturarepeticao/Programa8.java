package Estruturarepeticao;

import java.util.Scanner;

public class Programa8 {

    public static void main(String[] args) {

        int idade;
        String nome;

        Scanner teclado = new Scanner(System.in);

        //Primeiro executa o bloco, depois faz a checagem
        do {
            System.out.print("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.print("Informe sua idade: ");
            //idade = teclado.nextInt(); //Bug
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome + " tem " + idade + " anos.");
        } while (idade > 0);



        teclado.close();

    }

}
