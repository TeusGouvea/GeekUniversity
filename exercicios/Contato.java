package exercicios;

public class Contato {

    private String nome, email, telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }
}
