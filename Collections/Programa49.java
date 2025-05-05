package Collections;

//HashMap
/*
A classe HashMap implementa a interface Map e trabalha com o conceito de chave/valor.

Não aceita chaves duplicados, mas valores sim
*/

import ModificadoresDeAcesso.Cliente;
import ModificadoresDeAcesso.Conta;

import java.util.HashMap;
import java.util.Map;

public class Programa49 {

    public static void main(String[] args) {

        Map<String, Conta> contas = new HashMap<String, Conta>();

        Cliente cl1 = new Cliente(29,"Angelina Jolie", "Rua 1");
        Cliente cl2 = new Cliente(35,"Felicity Jones","Rua 2");

        Conta c1 = new Conta(1,200,300,cl1);
        Conta c2 = new Conta(2,400,700,cl2);

        contas.put("Pessoa Física", c1);
        contas.put("Pessoa Jurídica", c2);


//        System.out.println(contas.size());

        System.out.println(contas.get("Pessoa Física"));
    }
}
