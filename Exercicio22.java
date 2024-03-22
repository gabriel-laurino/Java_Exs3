public class Exercicio22 {
    public static void executar() {
        int tipoCliente = Prompt.lerInteiro("\nDigite o tipo de cliente (1-Residência, 2-Comércio, 3-Indústria):");
        double kwHora = Prompt.lerDecimal("Digite a quantidade de KW/h consumidos:");
        
        ContaLuz conta = new ContaLuz(tipoCliente, kwHora);
        conta.imprimirValorConta();
    }
}