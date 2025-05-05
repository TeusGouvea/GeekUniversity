package Threads;

// Thread Sincronizada

/*
O sincronismo ocorre pois durante a execução do método a thread executa um 'lock' (bloqueio) da função para que outra thread
só possa executá-la pós finalização da thread inicial.
*/
import ModificadoresDeAcesso.Cliente;
import ModificadoresDeAcesso.Conta;

public class Programa54 {

    public static void main(String[] args) throws InterruptedException {

        Cliente cli1 = new Cliente(25,"Marcos Paulo","Rua 1");
        Conta c1 = new Conta(1,200,300, cli1); //Saldo 500

        FazDeposito acao = new FazDeposito(c1);

        Thread t1 = new Thread(acao);
        Thread t2 = new Thread(acao);

        t1.join(); // avisando que a thread t1 deve 'se juntar' a um sincronizador.
        t2.join(); // avisando que a thread t1 deve 'se juntar' a um sincronizador.

        System.out.println(c1);
    }
}
