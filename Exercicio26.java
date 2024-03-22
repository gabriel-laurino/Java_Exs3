public class Exercicio26 {
    public static void executar() {
        String nome = Prompt.lerLinha("\nDigite o nome do segurado:");
        int idade = Prompt.lerInteiro("Digite a idade do segurado:");
        char grupoRisco = Character.toUpperCase(Prompt.lerChar("Digite o grupo de risco do segurado (Baixo[B], Médio[M], Alto[A]):"));

        Segurado segurado = new Segurado(nome, idade, grupoRisco);
        segurado.imprimirCategoria();
    }
}