import classes.Carro;
import util.Prompt;

public class Exercicio07 {
    public static void executar() {
        double custoFabrica = Prompt.lerDecimal("Digite o custo de fábrica do carro:");
        
        Carro carro = new Carro(custoFabrica);
        carro.imprimirCustoConsumidor();
    }
}