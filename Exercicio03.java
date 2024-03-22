public class Exercicio03 {
    public static void executar() {
        String nomeVendedor = Prompt.lerLinha("Digite o nome do vendedor:");
        double salarioFixo = Prompt.lerDecimal("Digite o salário fixo do vendedor:");
        double totalVendas = Prompt.lerDecimal("Digite o total de vendas efetuadas pelo vendedor (em dinheiro):");
        
        Vendedor vendedor = new Vendedor(nomeVendedor, salarioFixo, totalVendas);
        vendedor.imprimirSalarioFinal();
    }
}