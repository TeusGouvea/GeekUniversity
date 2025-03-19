package OrientacaoObjetos;

//Objetos
/*
- Objetos são produtos/instâncias da classe;
*/

public class Programa22 {

    public static void main(String[] args) {

        //Declaração e instanciação/iniciação do objeto
        //p1 -> instância do objeto / objeto
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 2.367f;
        p1.desconto = 15.0f;

        System.out.println("==== Produtos ====");
        System.out.println(p1.nome);
        System.out.println("R$: " + p1.preco);
        System.out.println(p1.desconto + "%");

        Produto p0= new Produto();
        p0.nome = "Caneta Bic";
        p0.preco = 2.45f;
        p0.desconto = 5;

        System.out.println();

        System.out.println(p0.nome);
        System.out.println("R$: " + p0.preco);
        System.out.println(p0.desconto + "%");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Matheus";
        pessoa1.email = "teste@email.com";
        pessoa1.ano_nascimento = 1995;

        System.out.println();

        System.out.println("==== Produtos ====");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("E-mail: " + pessoa1.email);
        System.out.println("Ano de Nascimento: " + pessoa1.ano_nascimento);

    }

}
