public class Main {
    public static void main(String[] args) {
        Cliente titular = new Cliente();
        titular.setNome("Jorge");

        Conta cc = new ContaCorrente(titular);
        cc.depositar(150);

        Conta poupanca = new ContaPoupanca(titular);
        cc.tranferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}