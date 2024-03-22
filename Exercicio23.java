public class Exercicio23 {
    public static void executar() {
        String nome = Prompt.lerLinha("\nDigite o nome da pessoa:");
        char sexo = Character.toUpperCase(Prompt.lerChar("Digite o sexo da pessoa (M/F):"));
        double altura = Prompt.lerDecimal("Digite a altura da pessoa (em metros):");
        int idade = Prompt.lerInteiro("Digite a idade da pessoa:");
        
        Pessoa pessoa = new Pessoa(nome, sexo, altura, idade);
        pessoa.imprimirPesoIdeal();
    }
}