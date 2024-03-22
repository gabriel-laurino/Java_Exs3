public class Exercicio12 {
    
    public static void executar() {
        int totalAte2000 = 0, totalGeral = 0;
        char continuar;

        do {
            String modelo = Prompt.lerLinha("Digite o modelo do veículo: ");
            int ano = Prompt.lerInteiro("Digite o ano de fabricação do veículo: ");
            double preco = Prompt.lerDecimal("Digite o preço do veículo: ");

            Veiculo veiculo = new Veiculo(modelo, ano, preco);
            veiculo.imprimirInfo();

            if (ano <=2000){
                totalAte2000++;
            }
            totalGeral++;

            continuar = Prompt.lerChar("\nDeseja continuar? (S/N) ");
        } while (Character.toUpperCase(continuar) != 'N');

        Prompt.imprimirf("\nTotal de veículos fabricados até 2000: %d\nTotal de veículos: %d\n", totalAte2000, totalGeral);
    }
}