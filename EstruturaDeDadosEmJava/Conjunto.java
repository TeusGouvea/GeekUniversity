package EstruturaDeDadosEmJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {

    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

    public Conjunto(){
        for (int i = 0; i < 26; i++) {
            tabela.add(new LinkedList<String>());
        }
    }

    private int calcularIndice(String nome){
        return nome.toLowerCase().charAt(0) % 26;
    }

    public void adiciona(String nome) {
        if (!contem(nome)) {
            int indice = calcularIndice(nome);
            List<String> lista = tabela.get(indice);
            lista.add(nome);
        }
    }

    private boolean contem(String nome){
        int indice = calcularIndice(nome);
        return tabela.get(indice).contains(nome);
    }

    public void remove(String nome){
        if (contem(nome)){
            int indice = calcularIndice(nome);
            List<String> lista = tabela.get(indice);
            lista.remove(nome);
        }
    }

    @Override
    public String toString() {
        return tabela.toString();
    }
}
