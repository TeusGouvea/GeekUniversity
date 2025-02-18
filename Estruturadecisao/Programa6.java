package Estruturadecisao;

public class Programa6 {

    public static void main(String[] args) {

        int numero = 12;

        //Instrução Switch

        switch (numero){
            case 0:
                System.out.println("O número é 0");
                break;
            case 3:
                System.out.println("O número é 3");
                break;
            case 5:
                System.out.println("O número é 5");
                break;
            default:
                System.out.println("O número é " + numero);
                break;
        }

    }

}
