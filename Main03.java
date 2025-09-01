package atividade;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("001", 200.0);
        ContaPoupanca cp = new ContaPoupanca("002", 100.0);

        cc.depositar(100);
        cc.sacar(50);
        cc.exibirSaldo(); 

        cp.depositar(50);
        boolean saqueSucesso = cp.sacar(90);  
        System.out.println("Saque conta poupança foi " + (saqueSucesso ? "realizado" : "negado"));
        cp.exibirSaldo(); 
    }
}
