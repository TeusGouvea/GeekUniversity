package ModificadoresDeAcesso;

public class Programa25 {

    public static void main(String[] args) {

        Cliente matheus = new Cliente("Matheus Santos", "Rua: Gilberto Freire, 699");
        Cliente maria = new Cliente("Diana de Paula Gouvêa", "Rua: Gilberto Freire, 678");

        Conta conta1 = new Conta(1, 100.0f, 200.0f, matheus);
        Conta conta2 = new Conta(2, 300.0f, 500.0f, maria);

        System.out.println("Saldo do Matheus (Antes do saque): " + conta1.getSaldo());
        System.out.println("Saldo do Maria: " + conta2.getSaldo());

        conta1.sacar(300);
        System.out.println("Saldo do Matheus (Depois do saque): " + conta1.getSaldo());

        conta1.depositar(500);
        System.out.println("Saldo do Matheus (Depois de depositar): " + conta1.getSaldo());
    }
}
