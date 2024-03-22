public class Exercicio04 {
    public static void executar() {
        double cotacaoDolar = Prompt.lerDecimal("Digite o valor da cotação do dólar:");
        double quantidadeDolares = Prompt.lerDecimal("Digite a quantidade de dólares:");
        
        ConversorDeMoeda conversor = new ConversorDeMoeda(cotacaoDolar, quantidadeDolares);
        conversor.imprimirValorEmReal();
    }
}