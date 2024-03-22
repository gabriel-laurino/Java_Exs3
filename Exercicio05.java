import classes.Compra;
import util.Prompt;

public class Exercicio05 {
    public static void executar() {
        double valorCompra = Prompt.lerDecimal("Digite o valor da compra:");
        Compra compra = new Compra(valorCompra);
        compra.imprimirPrestacoes();
    }
}