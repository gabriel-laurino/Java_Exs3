package classes;

import util.Prompt;

public class Veiculo {

    private String modelo;
    private int anoFabricacao;
    private double precoOriginal;

    public Veiculo(String modelo, int anoFabricacao, double precoOriginal) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.precoOriginal = precoOriginal;
    }

    public double calculoDesconto(){
        if(anoFabricacao <= 2000){
            return precoOriginal * 0.12;
        } else {
            return precoOriginal * 0.07;
        }
    }

    public double calculoValorFinal(){
        return precoOriginal - calculoDesconto();
    }

    public void imprimirInfo(){
        Prompt.imprimirf("\nModelo: %s, \nAno: %d, \nPreço original: %.2f, \nValor do desconto: %.2f, \nPreço com desconto: R$ %.2f\n", modelo, anoFabricacao, precoOriginal, calculoDesconto(), calculoValorFinal());
    }

}
