package Threads;

// Thread Não Sincronizada (Não é estável)

/*
Por padrão as threads não são sincronizadas. Pode ocorrer problemas de uma thread acessar o valor de um objeto que ainda não foi
utilizado ou ainda as threads executam depois do valor já estar impresso.
*/

import ModificadoresDeAcesso.Cliente;
import ModificadoresDeAcesso.Conta;

public class Programa53 {

    public static void main(String[] args) {
        Cliente cli1 = new Cliente(25,"Marcos Paulo","Rua 1");
        Conta c1 = new Conta(1,200,300, cli1); //Saldo 500

        FazDeposito acao = new FazDeposito(c1);

        Thread t1 = new Thread(acao);
        Thread t2 = new Thread(acao);

        t1.start();
        t2.start();

        System.out.println(c1);
    }
}
