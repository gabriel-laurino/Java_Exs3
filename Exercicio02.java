import classes.Automovel;
import util.Prompt;

public class Exercicio02 {
    public static void executar() {
        double distancia = Prompt.lerDecimal("Digite a distância total percorrida (em km):");
        double combustivel = Prompt.lerDecimal("Digite o total de combustível gasto (em litros):");
        
        Automovel automovel = new Automovel(distancia, combustivel);
        automovel.imprimirConsumoMedio();
    }
}