package FunçãoemJava;

//Ainda sobre funções

public class Programa21 {

    public static void main(String[] args) {

        int valor1 = 6, valor2 = 4, res;

        res = soma(valor1, valor2);

        System.out.println("O resultado é " + res);

        System.out.println(mensagem());
    }

    static int soma(int v1, int v2){
        return v1 + v2;
    }

    static String mensagem(){
        return "Olá Mundo";
    }

}
