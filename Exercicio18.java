import classes.FuncionarioAbono;
import util.Prompt;

public class Exercicio18 {
    public static void executar() {
        String nome = Prompt.lerLinha("\nDigite o nome do funcionário:");
        int idade = Prompt.lerInteiro("Digite a idade do funcionário:");
        char sexo = Character.toUpperCase(Prompt.lerChar("Digite o sexo do funcionário (M/F):"));
        double salarioFixo = Prompt.lerDecimal("Digite o salário fixo do funcionário:");

        FuncionarioAbono funcionario = new FuncionarioAbono(nome, idade, sexo, salarioFixo);
        funcionario.imprimirSalarioComAbono();
    }
}