package HerancaePolimorfismo;

//Sobrecarga de Método
/*
- Overloading

- Ocorre quando, sobrescrevemos um método na mesma classe de declaração.
*/
public class Programa29 {

    public static void main(String[] args) {

        Pessoa p1 =new Pessoa();

        p1.mensagem();

        p1.mensagem("Minha mensagem é diferente.");

        p1.mensagem("Essa é a terceira opção.", 666);

    }
}
