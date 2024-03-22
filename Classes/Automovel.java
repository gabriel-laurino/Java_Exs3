public class Automovel {
    private double distanciaPercorrida;
    private double combustivelGasto;

    public Automovel(double distanciaPercorrida, double combustivelGasto) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.combustivelGasto = combustivelGasto;
    }

    public double calcularConsumoMedio() {
        return distanciaPercorrida / combustivelGasto;
    }

    public void imprimirConsumoMedio() {
        Prompt.imprimir("\nO consumo médio do automóvel foi de " + calcularConsumoMedio() + " km/l.");
    }
}