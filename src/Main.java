
public class Main {
    public static void main(String[] args) {
        Cliente willian = new Cliente();
        willian.setNome("Willian");

        Conta cc = new ContaCorrente(willian);
        Conta poupanca = new ContaPoupanca(willian);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
