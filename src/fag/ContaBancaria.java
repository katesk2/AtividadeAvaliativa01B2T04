package fag;

public class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, double saldoInicial) {
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("O nome do titular não pode ser vazio.");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    // Método para sacar
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    // Getters e Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Nome do titular inválido!");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
