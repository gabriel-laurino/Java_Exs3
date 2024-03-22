import classes.VeiculoComDesconto;
import util.Prompt;

public class Exercicio15 {
    public static void executar() {
        double totalDesconto = 0, totalPago = 0;
        double valor;
        do {
            valor = Prompt.lerDecimal("\nDigite o valor do veículo (0 para sair):");
            if (valor == 0) break;
            char tipoCombustivel = Character.toUpperCase(Prompt.lerChar("Digite o tipo de combustível (A/G/D):"));

            VeiculoComDesconto veiculo = new VeiculoComDesconto(valor, tipoCombustivel);
            veiculo.imprimirValorComDesconto();
            
            double desconto = veiculo.calcularDesconto();
            totalDesconto += desconto;
            totalPago += (valor - desconto);
        } while (valor != 0);

        Prompt.imprimirf("\nTotal de desconto concedido: R$ %.2f\n", totalDesconto);
        Prompt.imprimirf("Total pago pelos clientes: R$ %.2f\n", totalPago);
    }
}