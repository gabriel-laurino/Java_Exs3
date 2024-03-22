public class Exercicio20 {
    public static void executar() {
        int nivel = Prompt.lerInteiro("\nDigite o nível do professor (1, 2 ou 3):");
        int horasAula = Prompt.lerInteiro("Digite a quantidade de horas/aula:");
        
        Professor professor = new Professor(nivel, horasAula);
        professor.imprimirSalario();
    }
}