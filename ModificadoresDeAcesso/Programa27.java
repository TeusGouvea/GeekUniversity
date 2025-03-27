package ModificadoresDeAcesso;
//Private
/*
- Privado à própria classe.

Ou seja, só temos acesso ao atributo ou método privado dentro da própria classe onde ele foi declarado.
*/
public class Programa27 {

    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Zeus Gouvêa", "Rua dos bobos, 0");

        System.out.println("Nome: " + cli1.getNome());
        System.out.println("Endereço: " + cli1.getEndereco());

        Cliente cli2 = new Cliente("Paula Lorem", "Rua lá ele, 50");

        System.out.println("Nome: " + cli2.getNome());
        System.out.println("Endereço: " + cli2.getEndereco());
    }
}
