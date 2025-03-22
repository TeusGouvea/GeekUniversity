package OrientacaoObjetos;

//Construtor
/*
- O construtor de uma classe SEMPRE tem o mesmo nome da classe;]
- Por padrão, a JVM - Java Virtual Machine, cria em tempo de execução, um construtor padrão - um construtor vazio;
- Podemos ter mais de um construtor na classe;
*/

public class Programa23 {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa(); //(Metodo) construtor

        pessoa1.nome = "Felicity Jones";
        pessoa1.email = "felicity@gmail.com";
        pessoa1.ano_nascimento = 1986;

       /* System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Email: " + pessoa1.email);
        System.out.println("Ano de nascimento: " + pessoa1.ano_nascimento);*/

        pessoa1.imprime_informacoes();

        System.out.println();

        Pessoa pessoa2 = new Pessoa("Angelina Jolie", "angelina@gmail.com", 1985);

        pessoa2.imprime_informacoes();

    }


}
