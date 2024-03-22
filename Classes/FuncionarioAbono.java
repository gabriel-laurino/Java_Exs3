public class FuncionarioAbono {
    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public FuncionarioAbono(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public double calcularAbono() {
        if (sexo == 'M') {
            return idade >= 30 ? 100 : 50;
        } else if (sexo == 'F') {
            return idade >= 30 ? 200 : 80;
        }
        return 0;
    }

    public void imprimirSalarioComAbono() {
        double salarioComAbono = salarioFixo + calcularAbono();
        Prompt.imprimirf("\n%s: Salário líquido com abono: R$ %.2f\n", nome, salarioComAbono);
    }
}