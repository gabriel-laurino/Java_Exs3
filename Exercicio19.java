import classes.Triangulo;
import util.Prompt;

public class Exercicio19 {
    public static void executar() {
        int ladoA = Prompt.lerInteiro("\nDigite o comprimento do lado A:");
        int ladoB = Prompt.lerInteiro("Digite o comprimento do lado B:");
        int ladoC = Prompt.lerInteiro("Digite o comprimento do lado C:");

        Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
        triangulo.classificarTriangulo();
    }
}