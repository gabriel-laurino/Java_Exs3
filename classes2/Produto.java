package classes;

import util.Prompt;

public class Produto {
    private double N1;
    private double N2;

// Início Produto Ex-06
    public Produto(double N1, double N2) {
        this.N1 = N1;
        this.N2 = N2;
    }

    public double calcularN2() {
        return N1 + (N1 * N2 / 100);
    }

    public void imprimirPrecoVenda() {
        Prompt.imprimirf("\nPreço de venda: R$ %.2f\n", calcularN2());
    }
// Fim Produto Ex-06

// Início Produto Ex-14
    public void imprimirResultados(){
        if (N2 > N1) {
            Prompt.imprimirf("\nLucro de R$ %.2f\n\n", N2 - N1);
        } else if (N2 < N1) {
            Prompt.imprimirf("\nPrejuízo de R$ %.2f\n\n", N1 - N2);
        } else {
            Prompt.imprimir("\nEmpate\n");
        }
    }

// Fim Produto Ex-14
}