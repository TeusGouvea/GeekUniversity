package EstruturaDeDadosEmJava;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    private List<String> nomes = new LinkedList<String>();

    /**
     *Em uma pilha, inserimos elementos sempre no topo.
     * @param name
     *
     * Na implementação do Java para pilhas (Stack) este método chama-se push
     */
    public void insere(String name){
        this.nomes.add(name);
    }

    /**
     *Em uma pilha, removemos sempre o elemento que está no topo.
     * @return
     *
     * Na implementação do Java para pilhas (Stack) este método chama-se pop
     */
    public String remove(){
        return nomes.remove(nomes.size() - 1);
    }

    public String pegaTopo(){
        return nomes.get(nomes.size() - 1);
    }

    public boolean empty(){
        return nomes.size() == 0 ;
    }

    @Override
    public String toString() {
        return this.nomes.toString();
    }
}
