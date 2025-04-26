package JavaLang;
//Trabalhando com Strings
/*
Em Java, Strings são imutáveis, ou seja, não mudam.
*/
public class Programa41 {

    public static void main(String[] args) {
        String curso = "Programação em Java: Essencial";

        //curso = curso.replace("Java", "Python");//Altera, se encontrar, a primeira palavra pela segunda.

//        curso = curso.toLowerCase(); // Converte as letras maiúsculas para minúsculas
//
//        System.out.println(curso);
//
//        curso = curso.toUpperCase();//Converte as letras minúsculas em maiúsculas
//
//        System.out.println(curso);
//
//        System.out.println(curso.charAt(0));

//        for (int i =0; i <curso.length(); i++){
//            System.out.println(curso.charAt(i));
//        }

        for (int i = (curso.length() -1); i >= 0; i--){
            System.out.print(curso.charAt(i));
        }
    }
}
