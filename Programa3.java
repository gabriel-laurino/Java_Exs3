public class Programa3 {
    public static void main(String[] args) {

        while (true) {
            int exercicio = Prompt.lerInteiro("\nDigite o número do exercício que deseja executar (1-20):");
            Prompt.linhaEmBranco();

            String nomeDaClasse = String.format("Exercicio%02d", exercicio);

            try {
                Prompt.imprimir("*"+nomeDaClasse+"*\n");
                Class<?> clazz = Class.forName(nomeDaClasse);
                clazz.getMethod("executar").invoke(null);
            } 
            catch (ClassNotFoundException e) {
                Prompt.imprimir("\nClasse do exercício não encontrada.");
            } 
            catch (NoSuchMethodException e) {
                Prompt.imprimir("\nMétodo 'executar' não encontrado na classe do exercício.");
            } 
            catch (Exception e) {
                Prompt.imprimir("\nOcorreu um erro ao executar o exercício: " + e.getMessage());
            }

            Prompt.separador();
            String resposta = Prompt.lerLinha("\nDeseja executar outro exercício? (S/N)");
            
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
