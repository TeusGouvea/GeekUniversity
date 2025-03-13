package exercicios;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int matriz[][] = new int[5][5];
        int x;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print("Informe o valor inteiro para a matriz["+i+"]"+"["+j+"]: ");
                matriz[i][j] = Integer.parseInt(teclado.nextLine());

            }

        }

        System.out.print("Informe um valor inteiro para buscar na matriz:");
        x = Integer.parseInt(teclado.nextLine());

        int encontrou = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                if (matriz[i][j] == x){
                    System.out.println("o valor "+ x + " está presente na posição matriz["+i+"]"+"["+j+"]");
                    encontrou = 1;
                }
            }

        }

        if (encontrou < 1){
            System.out.println("Não encontrado.");
        }

        teclado.close();
    }

}
