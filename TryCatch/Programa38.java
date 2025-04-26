package TryCatch;

import java.util.Scanner;

public class Programa38 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe n1: ");
        int n1 = teclado.nextInt();

        System.out.println("Informe n2: ");
        int n2 = teclado.nextInt();

        try {
            System.out.println(divisao(n1, n2));
//        }catch (ArithmeticException e){
//            System.out.println("Não consegui dividir os valores.");
        }catch (Exception e){
            System.out.println("Ocorreu uma outra exceção");
        }
        teclado.close();
    }

    //Estou criando uma função, que avisa que tem possibilidade de lançar uma exceção do tipo Exception
    public static int divisao(int n1,int n2) throws Exception{
        return n1 / n2;
    }
}
