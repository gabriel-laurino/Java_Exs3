public class Exercicio01 {
  public static void executar() {
      String nome = Prompt.lerLinha("Digite o nome do aluno:");
      double nota1 = Prompt.lerDecimal("Digite a nota da primeira prova:");
      double nota2 = Prompt.lerDecimal("Digite a nota da segunda prova:");
      double nota3 = Prompt.lerDecimal("Digite a nota da terceira prova:");

      Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
      aluno.imprimirMedia();
  }
}