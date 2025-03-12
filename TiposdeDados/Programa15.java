package TiposdeDados;

//Operações Matemáticas

public class Programa15 {

    public static void main(String[] args) {

        int num1 = 5, num2 = 9, res;
        float res2;

        //Soma
        res = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " é " + res);

        //Subtração
        res = num2 - num1;
        System.out.println("A subtração de " + num2 + " - " + num1 + " é " + res);

        //Multiplicação
        res = num1 * num2;
        System.out.println("A multiplicação de " + num1 + " * " + num2 + " é " + res);

        //Divisão (Inteira)
        res = num2 / num1;
        System.out.println("A divisão de " + num2 + " / " + num1 + " é " + res);

        //Divisão (Real)
        res2 = (float) num2 /(float) num1;
        System.out.println("A divisão de " + num2 + " / " + num1 + " é " + res2);

        //Módulo
        res = num1 % 2;
        System.out.println("O resto da divisão de " + num1 + " por 2 é " + res);
    }

}
