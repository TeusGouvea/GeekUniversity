package exercicios;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Contato> contatos = new ArrayList<Contato>();

    void armazenarContato(Contato contato){
        this.contatos.add(contato);
    }

    void removeContato(Contato contato){
        this.contatos.remove(contato);
    }

    int buscaContato(String nome){
        for (int i = 0; i < contatos.size(); i++){
            if (contatos.get(i).getNome() == nome){
                return i;
            }
        }
        return -1;
    }

    void imprimeAgenda(){
        System.out.println("======AGENDA======");
        for (Contato contato : contatos) {
            contato.imprimir();
        }
        System.out.println("======FIM======");
    }

    void imprimeContato(int index){
        contatos.get(index).imprimir();
    }
}
