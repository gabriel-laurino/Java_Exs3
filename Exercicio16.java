public class Exercicio16 {
    public static void executar() {
        for (int i = 0; i < 584; i++) {
            double salarioAtual = Prompt.lerDecimal("\nDigite o salário atual do funcionário " + (i + 1) + ":");
            Funcionario funcionario = new Funcionario(salarioAtual);
            funcionario.imprimirSalarioReajustado();
        }
    }
}