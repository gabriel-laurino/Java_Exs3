package classes;

import util.Prompt;

public class ConversorDeMoeda {
    private double cotacaoDolar;
    private double quantidadeDolares;

    public ConversorDeMoeda(double cotacaoDolar, double quantidadeDolares) {
        this.cotacaoDolar = cotacaoDolar;
        this.quantidadeDolares = quantidadeDolares;
    }

    public double converterParaReal() {
        return cotacaoDolar * quantidadeDolares;
    }

    public void imprimirValorEmReal() {
        Prompt.imprimir("\nValor em reais (R$): " + converterParaReal());
    }
}