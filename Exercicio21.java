public class Exercicio21 {
    public static void executar() {
        int idade = Prompt.lerInteiro("\nDigite a idade do nadador:");
        
        Nadador nadador = new Nadador(idade);
        nadador.classificarCategoria();
    }
}