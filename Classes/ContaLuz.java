public class ContaLuz {
    private int tipoCliente;
    private double kwHora;

    public ContaLuz(int tipoCliente, double kwHora) {
        this.tipoCliente = tipoCliente;
        this.kwHora = kwHora;
    }

    public double calcularValorConta() {
        switch (tipoCliente) {
            case 1:
                return kwHora * 0.60;
            case 2:
                return kwHora * 0.48;
            case 3:
                return kwHora * 1.29;
            default:
                return 0;
        }
    }

    public void imprimirValorConta() {
        Prompt.imprimirf("\nValor da conta de luz: R$ %.2f\n", calcularValorConta());
    }
}