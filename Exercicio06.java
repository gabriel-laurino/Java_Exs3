public class Exercicio06 {
    public static void executar() {
        double N1 = Prompt.lerDecimal("Digite o preço de custo do produto:");
        double N2 = Prompt.lerDecimal("Digite o percentual de aumento:");
        
        Produto produto = new Produto(N1, N2);
        produto.imprimirPrecoVenda();
    }
}