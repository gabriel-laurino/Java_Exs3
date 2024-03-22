public class Exercicio11{

    public static void executar(){
        int totalHomens = 0, totalMulheres = 0;
        for(int i = 0; i<56; i++){

            String nome = Prompt.lerLinha("\nDigite o nome da pessoa "+(i+1)+" :");
            char sexo = Character.toUpperCase(Prompt.lerChar("Digite o sexo da pessoa (M/F):"));
            Pessoa pessoa = new Pessoa(nome, sexo);
            pessoa.imprimirNomeSexo();
            if (sexo == 'M') {
                totalHomens++;
            } else if (sexo == 'F') {
                totalMulheres++;
            }
        }
        Prompt.imprimir("\nTotal de homens: " + totalHomens + "\nTotal de mulheres: " + totalMulheres);    
    }
}