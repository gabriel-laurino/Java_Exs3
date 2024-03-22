import classes.Funcionario;
import util.Prompt;

public class Exercicio17{
    public static void executar() {
        double aumentoTotal = 0;
        for (int i = 0; i < 5; i++) {
            String nome = Prompt.lerLinha("\nDigite o nome do funcionário " + (i + 1) + ":");
            double salarioAtual = Prompt.lerDecimal("Digite o salário atual do funcionário:");
            Funcionario funcionario = new Funcionario(nome, salarioAtual);
            funcionario.imprimirInformacoesReajustadas();
            aumentoTotal += funcionario.calcularReajuste();
        }
        Prompt.imprimirf("\nAumento total na folha de pagamento: R$ %.2f\n", aumentoTotal);
    }
}