package classes;

import util.Prompt;

public class Professor {
    private int nivel;
    private int horasAula;

    public Professor(int nivel, int horasAula) {
        this.nivel = nivel;
        this.horasAula = horasAula;
    }

    public double calcularSalario() {
        switch (nivel) {
            case 1:
                return horasAula * 12;
            case 2:
                return horasAula * 17;
            case 3:
                return horasAula * 25;
            default:
                return 0;
        }
    }

    public void imprimirSalario() {
        Prompt.imprimirf("\nSalário: R$ %.2f\n", calcularSalario());
    }
}