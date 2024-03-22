package classes;

import util.Prompt;

public class Funcionario {
    private String nome;
    private double salarioAtual;
    private static final double SALARIO_MINIMO = 1412.00; // 2024

    public Funcionario(String nome, double salarioAtual) {
        this.nome = nome;
        this.salarioAtual = salarioAtual;
    }

    public Funcionario(double salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public double calcularReajuste() {
        if (salarioAtual < 3 * SALARIO_MINIMO) {
            return salarioAtual * 0.50;
        } else if (salarioAtual <= 10 * SALARIO_MINIMO) {
            return salarioAtual * 0.20;
        } else if (salarioAtual <= 20 * SALARIO_MINIMO) {
            return salarioAtual * 0.15;
        } else {
            return salarioAtual * 0.10;
        }
    }

    public void imprimirSalarioReajustado() {
        Prompt.imprimirf("Salário reajustado: R$ %.2f\n", calcularReajuste());
    }

    public void imprimirInformacoesReajustadas() {
        double novoSalario = salarioAtual + calcularReajuste();
        Prompt.imprimir("\nNome do funcionário: " + nome);
        Prompt.imprimirf("Salário atual: R$ %.2f\n", salarioAtual);
        Prompt.imprimirf("Reajuste de: R$ %.2f\n", (novoSalario - salarioAtual));
        Prompt.imprimirf("Novo salário após reajuste: R$ %.2f\n", novoSalario);
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public double getNovoSalario() {
        return salarioAtual + calcularReajuste();
    }
}