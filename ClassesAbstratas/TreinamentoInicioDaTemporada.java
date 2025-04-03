package ClassesAbstratas;

public class TreinamentoInicioDaTemporada extends Treinamento{
    @Override
    public void preaparoFisico() {
        System.out.println("Preparo físico de início da temporada...");
    }

    @Override
    public void jogoTreino() {
        System.out.println("jogo treino de início da temporada...");
    }
}
