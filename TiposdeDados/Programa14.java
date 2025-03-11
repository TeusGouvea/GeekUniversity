package TiposdeDados;

//TIpos booleanos

public class Programa14 {

    public static void main(String[] args) {

        //Tipos primitivos
        boolean verdadeiro = true;
        boolean falso = false;

        //Tipo não primitivos
        Boolean v = true;
        Boolean f = false;

        System.out.println("Verdadeiro " + verdadeiro);
        System.out.println("Falso " + falso);
        System.out.println("V " + v);
        System.out.println("F " + f);

        if (verdadeiro == true){
            System.out.println("Verdadeiro");
        }else {
            System.out.println("Falso");
        }

        if (1 == 1){
            System.out.println("1 == 1 é verdadeiro");
        }else {
            System.out.println("... é falso");
        }

    }

}
