package EstruturaDeDadosEmJava;

import java.util.Arrays;

public class Vetor {
    private Aluno alunos[] = new Aluno[100];
    private int total = 0;

    public void adiciona(Aluno aluno){
        this.alunos[total] = aluno;
        total = total + 1;
    }

    public void adiciona(int posicao, Aluno aluno){
        this.alunos[posicao] = aluno;
    }

    public Aluno pega(int posicao){
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }

    public void remove(int posicao){
        this.alunos[posicao] = null;
    }

    public boolean contem(Aluno aluno){
        for (int i = 0; i < total; i++){
            if (aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return this.total;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.alunos); //Facilita a visualização do array
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < total;
    }
}
