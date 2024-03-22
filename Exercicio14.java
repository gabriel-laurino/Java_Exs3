import classes.Produto;
import util.Prompt;

public class Exercicio14 {
    public static void executar() {
        double somaCusto = 0, somaVenda = 0;
        for (int i = 0; i < 40; i++) {
            double N1 = Prompt.lerDecimal("Digite o preço de custo do produto:");
            double precoVenda = Prompt.lerDecimal("Digite o preço de venda do produto:");
            Produto produto = new Produto(N1, precoVenda);
            produto.imprimirResultados();
            somaCusto += N1;
            somaVenda += precoVenda;
        }
        Prompt.imprimirf("Média de preço de custo: R$ %.2f\n", somaCusto / 40);
        Prompt.imprimirf("Média de preço de venda: R$ %.2f\n", somaVenda / 40);
    }
}