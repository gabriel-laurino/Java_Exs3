package classes;

import util.Prompt;

public class Pessoa {
    private int idade;
    private String nome;
    private char sexo;
    private char saude;
    private double altura;

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Pessoa(String nome, char sexo, int idade, char saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public Pessoa(String nome, char sexo, double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }

// Classificação:
    public void imprimirClassificacao(){
        if (idade >= 18) {
            Prompt.imprimir("\nMaior de idade");            
        } else {
            Prompt.imprimir("\nMenor de idade");
        }
    }
// Fim Classificação.

// Nome e Sexo:
    public void imprimirNomeSexo(){
        String descricaoSexo = (sexo == 'M' ? "Homem" : (sexo == 'F' ? "Mulher" : "Sexo inválido"));
        if ("Sexo inválido".equals(descricaoSexo)) {
            Prompt.imprimir("\nSexo inválido, Pessoa descartada.");
        } else {
            Prompt.imprimir("\nNome: " + nome);
            Prompt.imprimir("Sexo: " + descricaoSexo);
        }
    }
    public char getSexo() {
        return sexo;
    }
// Fim Nome e Sexo.

// Saude:
public void imprimirSaude(){
    if (saude == 'S') {
        Prompt.imprimir("\nApto para servir o serviço militar\n");
    } else if (saude == 'N') {
        Prompt.imprimir("\nInapto para servir o serviço militar\n");
    } else {
        Prompt.imprimir("\nOpção inválida\n");
    }
}
// Fim Saude.

// Peso Ideal:
public void imprimirPesoIdeal() {
    double pesoIdeal = 0;

    if (sexo == 'M') {
        if (idade <= 20) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (idade <= 39) {
            pesoIdeal = (72.7 * altura) - 53;
        } else {
            pesoIdeal = (72.7 * altura) - 45;
        }
    } else if (sexo == 'F') {
        if (altura > 1.50) { 
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            if (idade >= 35) {
                pesoIdeal = (62.1 * altura) - 45;
            } else {
                pesoIdeal = (62.1 * altura) - 49;
            }
        }
    }
    Prompt.imprimirf("\nNome: %s\nPeso ideal: %.2f kg\n", nome, pesoIdeal);
}
// Fim Peso Ideal.
}