package atividade;

public class ContaPoupanca extends ContaBancaria {
    private static final double SALDO_MINIMO = 50.0;

    public ContaPoupanca(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (saldo - valor) >= SALDO_MINIMO) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
