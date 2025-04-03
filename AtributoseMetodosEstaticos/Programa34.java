package AtributoseMetodosEstaticos;

//Atributos estáticos
/*
Atributos estáticos são atributos, onde os valores são compartilhados entre as
instâncias da classe.

Para utilizar um atributo estático, colocamos o nome da classe junto ao atributo.

Exemplo:

NomeDaClasse.atributo;

*/
public class Programa34 {

    public static void main(String[] args) {

        Conta c1 = new Conta("Pedro Alvares");
        System.out.println(c1.getNumero());
        System.out.println(c1.getCliente());

        Conta c2 = new Conta ("Felicity Jones");
        System.out.println(c2.getNumero());
        System.out.println(c2.getCliente());

        Conta c3 = new Conta ("Matheus Gouvêa");
        System.out.println(c3.getNumero());
        System.out.println(c3.getCliente());

        System.out.println(Conta.contador);

        Conta.contador = 42;

        Conta c4 = new Conta ("Fergus Maclourem");
        System.out.println(c4.getNumero());
        System.out.println(c4.getCliente());

        Conta c5 = new Conta ("Bob Craw");
        System.out.println(c5.getNumero());
        System.out.println(c5.getCliente());

    }
}
