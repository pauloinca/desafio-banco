package project.pkg;

public class Main {

    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setNome("Paulo");

        Conta cc = new ContaCorrente(cli);
        Conta poupanca = new ContaPoupanca(cli);

        cc.depositar(200);;
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
