package classes;

import util.Prompt;

public class Compra {
    private double valorTotal;

    public Compra(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void imprimirPrestacoes() {
        double valorPrestacao = valorTotal / 5;
        for (int i = 1; i <= 5; i++) {
            Prompt.imprimir("\nValor da prestação " + i + ": " + valorPrestacao);
        }
    }
}