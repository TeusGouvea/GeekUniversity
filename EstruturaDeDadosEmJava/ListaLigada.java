package EstruturaDeDadosEmJava;

public class ListaLigada {

    private Celula primeira = null;
    private Celula ultima = null;
    private int total = 0;

    /**
     * Método que adiciona um objeto no começo da lista
     * @param elemento
     */
    public void adicionaNoComeco(Object elemento){
        if (this.total == 0){
            Celula nova = new Celula(elemento);
            this.primeira = nova;
            this.ultima = nova;
        } else {
            Celula nova = new Celula(elemento, this.primeira);
            this.primeira.setAnterior(nova);
            this.primeira = nova;
        }
        this.total = this.total + 1;
    }

    /**
     * Método que adiciona um objeto no final da lista
     * @param elemento
     */
    public void adiciona(Object elemento){
        if (this.total == 0){
            this.adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento);
            this.ultima.setProximo(nova);
            nova.setAnterior(this.ultima);
            this.ultima = nova;
            this.total = this.total + 1;
        }
    }

    /**
     * Método que adiciona um elemento no meio  da lista,
     * de acordo com a posição
     * @param elemento
     */
    public void adiciona(int posicao, Object elemento){
        if (posicao == 0){
            this.adicionaNoComeco(elemento);
        } else if (posicao == this.total){
            this.adiciona(elemento);
        } else{
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula nova = new Celula(elemento, anterior.getProximo());

            Celula proxima = anterior.getProximo();

            anterior.setProximo(nova);
            nova.setAnterior(anterior);
            proxima.setAnterior(nova);
            this.total = this.total + 1;
        }
    }

    public Object pega(int posicao){
        return this.pegaCelula(posicao).getElemento();
    }

    public void remove(int posicao){
        if (posicao == 0){
            this.removeDoComeco();
        } else if (posicao == this.total - 1) {
            this.removeDoFim();
        } else {
            Celula anterior = this.pegaCelula(posicao - 1);
            Celula atual = anterior.getProximo();
            Celula proxima = atual.getProximo();

            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);

            this.total = this.total - 1;
        }
    }

    public void removeDoFim(){
        if (this.total == 1){
            this.removeDoComeco();
        } else {
            Celula penultima = this.ultima.getAnterior();
            penultima.setProximo(null);
            this.ultima = penultima;
            this.total = this. total - 1;
        }
    }

    public void removeDoComeco(){
        if (this.total == 0){
            throw new IllegalArgumentException("Lista vazia");
        }
        this.primeira = this.primeira.getProximo();
        this.total = this.total - 1;

        if (this.total ==0){
            this.ultima = null;
        }
    }

    public int tamanho(){
        return this.total;
    }

    public boolean contem(Object obj){
        Celula atual = this.primeira;

        while (atual != null){
            if (atual.getElemento().equals(obj)){
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    @Override
    public String toString() {
        if (total == 0){
            return "[]";
        }
        Celula atual = primeira;
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < total; i++){
            builder.append(atual.getElemento());
            builder.append(",");

            atual = atual.getProximo();
        }
        builder.append("]");
        return builder.toString();
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < this.total;
    }

    private Celula pegaCelula(int posicao){
        if (!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inexistente");
        }
        Celula atual = this.primeira;

        for (int i = 0; i < posicao; i++){
            atual = atual.getProximo();
        }
        return atual;
    }
}
