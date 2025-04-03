package Interfaces;

public class Ventilador implements Eletronico{
    private boolean ligado = false;

    @Override
    public void ligar() {
        if (!this.ligado){
            this.ligado = true;
            System.out.println("Liguei o ventilador...");
        }
    }

    @Override
    public void desligar() {
        if (this.ligado){
            this.ligado = false;
            System.out.println("Desliguei o ventilador...");
        }
    }
}
