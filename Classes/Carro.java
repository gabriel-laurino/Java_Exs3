public class Carro {
    private double custoFabrica;

    public Carro(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double impostos = custoFabrica * 0.45;
        double distribuidor = (custoFabrica + impostos) * 0.28;
        return custoFabrica + impostos + distribuidor;
    }

    public void imprimirCustoConsumidor() {
        Prompt.imprimirf("\nCusto ao consumidor: R$ %.2f\n", calcularCustoConsumidor());
    }
}