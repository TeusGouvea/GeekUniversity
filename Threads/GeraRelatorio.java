package Threads;

/*
Para executar metodos em paralelo, nossa classe deve implementar a interface Runnable, e o método que preicsar ser
executado em paralelo deve ser executada dentro do método run
*/

public class GeraRelatorio implements Runnable {

    public void executa(){
        for (int i = 0; i < 1000; i++){
            System.out.println("Barra de progresso...aguarde " + i + "%");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 101; i++){
            System.out.println("Gerando relatório...aguarde " + i + " %");
        }
    }
}
