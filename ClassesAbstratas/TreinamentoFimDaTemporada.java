package ClassesAbstratas;

public class TreinamentoFimDaTemporada extends Treinamento{
    @Override
    public void preaparoFisico() {
        System.out.println("Preparo físico de fim da temporada...");
    }

    @Override
    public void jogoTreino() {
        System.out.println("jogo treino de fim da temporada...");
    }
}
