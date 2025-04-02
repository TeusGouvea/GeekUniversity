package HerancaePolimorfismo;

public class Quadrado {

    private float lado, area, perimetro;

    public Quadrado(float lado){
        this.lado = lado;
        this.calcularArea();
        this.calcularPerimetro();
    }

    void calcularArea(){
        this.area = this.lado * this.lado;
    }

    void calcularPerimetro(){
        this.perimetro = 4 * this.lado;
    }

    void imprimir(){
        System.out.println("Lado: " + this.lado);
        System.out.println("Área: " + this.area);
        System.out.println("Perímetro: " + this.perimetro);
    }
}
