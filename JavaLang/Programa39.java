package JavaLang;

//Object: A mãe de todas as classes
/*
A classe Object, faz parte do pacote java.lang
*/

import ModificadoresDeAcesso.Cliente;
import ModificadoresDeAcesso.Conta;

public class Programa39 {

    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Kratos", "Rua dos bobos, 0");
        Cliente cli2 = new Cliente("Leon", "Rua dos bobos, 10");

        Conta c1 = new Conta(1, 200, 300, cli1);
        Conta c2 = new Conta(2, 200, 300, cli2);

        Caixa prateleira = new Caixa();

        System.out.println(c1); //por padrão a instância imprime com toString()
        System.out.println(c2);

        if (c1.equals (c2)){
            System.out.println("São a mesma conta");
        }else {
            System.out.println("São contas diferentes");
        }

        prateleira.adicionar(c1);
        prateleira.adicionar(c2);

        //Conta conta = prateleira.pegar(0);

        System.out.println(((Conta)prateleira.pegar(0)).getSaldo());

        prateleira.adicionar(cli1);

        System.out.println(((Cliente)prateleira.pegar(2)).getNome());

        if (c1 instanceof Conta){
            System.out.println("O objeto é do tipo conta.");
        }else {
            System.out.println("O objeto não é do tipo conta.");
        }
    }
}
