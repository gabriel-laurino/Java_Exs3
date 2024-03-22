package classes;

import util.Prompt;

public class Vendedor {
    private String nome;
    private double salarioFixo;
    private double totalVendas;

    public Vendedor(String nome, double salarioFixo, double totalVendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
    }

    public double calcularSalarioFinal() {
        return salarioFixo + (totalVendas * 0.15);
    }

    public void imprimirSalarioFinal() {
        Prompt.imprimir("\nNome do vendedor: " + nome);
        Prompt.imprimir("Salário no final do mês: " + calcularSalarioFinal());
    }
}