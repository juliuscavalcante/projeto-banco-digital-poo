package bancodigital;

public class Main {
    public static void main(String[] args) {

        Cliente julius = new Cliente();
        julius.setNome("Julius");

        Conta cc = new ContaCorrente(julius);
        Conta cp = new ContaPoupanca(julius);

        cc.depositar(100);
        cc.transferir(75,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        }
}

