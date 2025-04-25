package ModificadoresDeAcesso;

//Protected
//É o modificar de acesso default (Padrão)
/*
- O modificar de acesso Protected faz com que o elemento seja visível somente dentro do mesmo pacote onde ele foi declrado
*/
public class Cliente {

    private String nome;
    private String endereco;

    public Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

     void dizer_oi(){
        System.out.println(this.nome + " está dizendo oi...");
    }

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }
}