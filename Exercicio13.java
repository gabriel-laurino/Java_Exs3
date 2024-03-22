public class Exercicio13{

    public static void executar() {
        int numeroPessoas = Prompt.lerInteiro("Digite o número de pessoas:");
        int totalAptos = 0;

        for(int i = 0; i < numeroPessoas; i++){
            String nome = Prompt.lerLinha("Digite o nome da pessoa: ");
            char sexo = Character.toUpperCase(Prompt.lerChar("Digite o sexo da pessoa (M/F): "));
            int idade = Prompt.lerInteiro("Digite a idade da pessoa: ");
            char saude = Character.toUpperCase(Prompt.lerChar("A pessoa está saudável? (S/N): "));

            Pessoa pessoa = new Pessoa(nome, sexo, idade, saude);
            pessoa.imprimirNomeSexo();
            Prompt.imprimir("Idade: " + idade + " anos");
            pessoa.imprimirSaude();
            if (saude == 'S') {
                totalAptos++;
            }
        }
        Prompt.imprimir("\nTotal de pessoas aptas: " + totalAptos);
    }
}