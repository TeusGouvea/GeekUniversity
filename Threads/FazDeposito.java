package Threads;

import ModificadoresDeAcesso.Conta;

public class FazDeposito implements Runnable{
    private Conta conta;

    public FazDeposito(Conta conta){
        this.conta = conta;
    }

    @Override
    public void run() {
        this.conta.depositar(100.0f);
    }

}
