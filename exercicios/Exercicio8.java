package exercicios;

public class Exercicio8 {

    public static void main(String[] args) {

        int i;

        System.out.println("------- via for------------");

        for (i = 1; i <= 100; i++){
            System.out.println(i);
        }

        System.out.println("------- via while------------");
        i = 1;

        while (i <= 100){
            System.out.println(i);
            i = i +1;
        }

        System.out.println("------- via do while------------");
        i = 1;

        do {
            System.out.println(i);
            i = i + 1;
        } while (i <= 100);

    }

}
