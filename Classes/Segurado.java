package classes;

import util.Prompt;

public class Segurado {
    private String nome;
    private int idade;
    private char grupoRisco;

    public Segurado(String nome, int idade, char grupoRisco) {
        this.nome = nome;
        this.idade = idade;
        this.grupoRisco = grupoRisco;
    }

    public int determinarCategoria() {
        if (idade < 17 || idade > 70) return -1;
        if (idade <= 20) return grupoRisco == 'B' ? 1 : grupoRisco == 'M' ? 2 : 3;
        if (idade <= 24) return grupoRisco == 'B' ? 2 : grupoRisco == 'M' ? 3 : 4;
        if (idade <= 34) return grupoRisco == 'B' ? 3 : grupoRisco == 'M' ? 4 : 5;
        if (idade <= 64) return grupoRisco == 'B' ? 4 : grupoRisco == 'M' ? 5 : 6;
        return grupoRisco == 'B' ? 7 : grupoRisco == 'M' ? 8 : 9;
        }

    public void imprimirCategoria() {
        int categoria = determinarCategoria();
        if (categoria == -1) {
            Prompt.imprimir(nome + " não se enquadra em nenhuma das categorias ofertadas.");
        } else {
            Prompt.imprimirf("%s é classificado na categoria %d de seguro.\n", nome, categoria);
        }
    }
}