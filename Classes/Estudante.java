public class Estudante {
    private String nome;
    private int matricula;
    private double notaLaboratorio;
    private double notaSemestral;
    private double notaFinal;

    public Estudante(String nome, int matricula, double notaLaboratorio, double notaSemestral, double notaFinal) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaLaboratorio = notaLaboratorio;
        this.notaSemestral = notaSemestral;
        this.notaFinal = notaFinal;
    }

    public double calcularNotaFinal() {
        return (notaLaboratorio * 2 + notaSemestral * 3 + notaFinal * 5) / 10;
    }

    public String determinarClassificacao() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 8) return "A";
        else if (notaFinal >= 7) return "B";
        else if (notaFinal >= 6) return "C";
        else if (notaFinal >= 5) return "D";
        else return "R";
    }

    public void imprimirResultado() {
        Prompt.imprimirf("%s (Matrícula: %d) - Nota Final: %.2f - Classificação: %s\n",
                         nome, matricula, calcularNotaFinal(), determinarClassificacao());
    }
}