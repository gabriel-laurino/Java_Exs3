public class Triangulo {
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public boolean ehTriangulo() {
        return ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB;
    }

    public void classificarTriangulo() {
        if (!ehTriangulo()) {
            Prompt.imprimir("\nOs valores informados não formam um triângulo.");
            return;
        }
        
        if (ladoA == ladoB && ladoB == ladoC) {
            Prompt.imprimir("\nTriângulo Equilátero");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            Prompt.imprimir("\nTriângulo Isósceles");
        } else {
            Prompt.imprimir("\nTriângulo Escaleno");
        }
    }
}