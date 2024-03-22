package classes;

import util.Prompt;

public class Aluno {
    private String nome;
    private double[] notas = new double[3];

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
    }
// Média:
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        return media;
    }

    public void imprimirMedia() {
        Prompt.imprimir("\nNome do aluno: " + nome);
        Prompt.imprimirf("Média do aluno: %.2f", calcularMedia());
    }
//Fim média

//Indice do aluno:
    public void indice() {
        double media = calcularMedia();
        if (media >= 7) {
            Prompt.imprimir("\nAprovado");
        } else if (media >= 5) {
            Prompt.imprimir("\nRecuperação");
        } else {
            Prompt.imprimir("\nReprovado");
            
        }
    }
//Fim Indice do aluno
}