package ClassesAbstratas;

import HerancaePolimorfismo.Aluno;

//Classes Abstratas
/*
- É um recurso que proporciona um bloqueio na criação de objetos;
- Não conseguimos instanciar objetos de uma classe abstrata;
*/
public class Programa31 {

    public static void main(String[] args) {

        Aluno maria = new Aluno("Maria da Silva", 1999, "maria@gmail.com", "123456");

        System.out.println(maria);

        System.out.println("Meu nome é " + maria.getNome());

    }
}
