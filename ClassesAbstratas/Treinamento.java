package ClassesAbstratas;

//Template Method
/*
- Final é um modificador de acesso que faz com que o elemento que esteja utilizando, não possa ser extendido/reescrito.
*/
public abstract class Treinamento {

    //Template Method
    public final void treinoDiario(){
        preaparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preaparoFisico();

    public abstract void jogoTreino();

    public final void treinoTatico(){
        System.out.println("Treino tático...");
    }
}
