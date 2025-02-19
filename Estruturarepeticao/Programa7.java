package Estruturarepeticao;

//while e do while

import java.util.Scanner;

public class Programa7 {

    public static void main(String[] args) {

        int idade = 1;
        String nome;

        Scanner teclado = new Scanner(System.in);

        //Sempre checa o valor antes de executar o bloco
        while (idade > 0){
            System.out.print("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.print("Informe sua idade: ");
            //idade = teclado.nextInt(); //Bug
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome + " tem " + idade + " anos.");
        }



        teclado.close();

    }

}
