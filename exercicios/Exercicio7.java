package exercicios;

public class Exercicio7 {

    public static void main(String[] args) {

        int contador = 0;

        for (int i = 1; contador < 5; i++){
            if (i % 3 == 0){
                System.out.println("O número " + i + " é múltiplo de 3.");
                contador += 1;
            }
        }

    }

}
