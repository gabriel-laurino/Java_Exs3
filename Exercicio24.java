public class Exercicio24 {
    public static void executar() {
        String nome = Prompt.lerLinha("\nDigite o nome do estudante:");
        int matricula = Prompt.lerInteiro("Digite o número de matrícula:");
        double notaLaboratorio = Prompt.lerDecimal("Digite a nota do trabalho de laboratório:");
        double notaSemestral = Prompt.lerDecimal("Digite a nota da avaliação semestral:");
        double notaFinalExame = Prompt.lerDecimal("Digite a nota do exame final:");
        
        Estudante estudante = new Estudante(nome, matricula, notaLaboratorio, notaSemestral, notaFinalExame);
        estudante.imprimirResultado();
    }
}