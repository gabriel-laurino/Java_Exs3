public class Nadador {
    private int idade;

    public Nadador(int idade) {
        this.idade = idade;
    }

    public void classificarCategoria() {
        if (idade >= 5 && idade <= 7) {
            Prompt.imprimir("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            Prompt.imprimir("Categoria: Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            Prompt.imprimir("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            Prompt.imprimir("Categoria: Juvenil B");
        } else if (idade >= 18 && idade <= 25) {
            Prompt.imprimir("Categoria: Sênior");
        } else {
            Prompt.imprimir("Idade fora da faixa etária");
        }
    }
}