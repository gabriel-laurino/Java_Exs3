package classes;

import util.Prompt;

public class VeiculoComDesconto {
    private double valorVeiculo;
    private char tipoCombustivel;

    public VeiculoComDesconto(double valorVeiculo, char tipoCombustivel) {
        this.valorVeiculo = valorVeiculo;
        this.tipoCombustivel = tipoCombustivel;
    }

    public double calcularDesconto() {
        switch (tipoCombustivel) {
            case 'A': return valorVeiculo * 0.25;
            case 'G': return valorVeiculo * 0.21;
            case 'D': return valorVeiculo * 0.14;
            default: return 0;
        }
    }

    public void imprimirValorComDesconto() {
        double valorComDesconto = valorVeiculo - calcularDesconto();
        Prompt.imprimirf("Valor com desconto: R$ %.2f\n", valorComDesconto);
    }
}