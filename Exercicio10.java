public class Exercicio10{

    public static void executar(){

        int numeroPessoas = Prompt.lerInteiro("Digite o número de pessoas: ");
        for(int i = 0; i < numeroPessoas; i++){
            int idade = Prompt.lerInteiro("Digite a idade da pessoa " + (i + 1) + ": ");
            Pessoa pessoa = new Pessoa(idade);
            pessoa.imprimirClassificacao();
        }
    }
}