package HerancaePolimorfismo;
/* Benefícios da Herança
- Evita a repetição de código;
- Facilita a manutenção do programa;

- Classe específica;
- Sub-classe
- clase filha
*/
//Aluno é uma Pessoa
/*
- QUando uma classe herda de outra classe ela ganha:
 - TODOS os atributos e métodos da clase herdada.
*/
public class Aluno extends Pessoa {
    private String ra;

    public Aluno (String nome, int ano_nascimento,String email, String ra){
        super(nome, ano_nascimento, email);
        this.ra = ra;
    }

    public String getRa(){
        return this.ra;
    }

    public void setRa(String ra){
        this.ra = ra;
    }

    //Overrinding/ Sobrescrita de método
    public String toString(){
        return super.toString() + "\nR.A.: " + this.ra;
    }

    public String getNome(){
        return "Aluno: \n" + super.getNome();
    }
}
