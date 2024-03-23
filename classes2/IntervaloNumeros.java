package classes;

import util.Prompt;

public class IntervaloNumeros {
    private int[] numeros;
    
    public IntervaloNumeros(int tamanho) {
        numeros = new int[tamanho];
    }
    
    public void lerNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Prompt.lerInteiro("Digite o número " + (i + 1) + ":");
        }
    }
    
    public void imprimirNumerosNoIntervalo(int minimo, int maximo) {
        int contagem = 0;
        for (int numero : numeros) {
            if (numero >= minimo && numero <= maximo) {
                contagem++;
            }
        }
        Prompt.imprimir("\nQuantidade de números no intervalo entre " + minimo + " e " + maximo + ": " + contagem);
    }
}