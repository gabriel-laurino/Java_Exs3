import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Um classe utilitária para imprimir e ler textos, números inteiros e decimais
 * no prompt de comandos.
 * 
 * @version 1.0 Mar 2023
 * @author Geucimar Briatore
 * 
 * @version 1.1 Mar 2024
 * Modificado por: Gabriel Laurino para uso pessoal.
 * 
 * @Adições: formatação de texto com printf em 'imprimirf'.
 */
public class Prompt {

	/**
	 * Imprime a mensagem enviada no console.
	 */
	public static void imprimir(String mensagem) {
		System.out.println(mensagem);
		System.out.flush();
	}

	/**
	 * Imprime o objeto enviado no console.
	 */
	public static void imprimir(Object object) {
		System.out.println(object);
		System.out.flush();
	}

	public static void imprimirf(String objectFormat, Object args) {
		System.out.printf(objectFormat, args);
		System.out.flush();
	}

	public static void imprimirf(String objectFormat, Object args, Object args2) {
		System.out.printf(objectFormat, args, args2);
		System.out.flush();
	}

	public static void imprimirf(String objectFormat, Object args, Object args2, Object args3) {
		System.out.printf(objectFormat, args, args2, args3);
		System.out.flush();
	}

	public static void imprimirf(String objectFormat, Object args, Object args2, Object args3, Object args4) {
		System.out.printf(objectFormat, args, args2, args3, args4);
		System.out.flush();
	}

	public static void imprimirf(String objectFormat, Object args, Object args2, Object args3, Object args4, Object args5) {
		System.out.printf(objectFormat, args, args2, args3, args4, args5);
		System.out.flush();
	}

	/**
	 * Imprime uma linha separadora no console.
	 */
	public static void separador() {
		imprimir("\n---------------------------------------------------");
	}

	/**
	 * Imprime uma linha em branco no console.
	 */
	public static void linhaEmBranco() {
		System.out.println();
		System.out.flush();
	}

	/**
	 * Imprime a mensagem enviada, faz a leitura do texto digitado no prompt de
	 * comandos e retorna uma String no formato ISO-8859-1 Latin ou UTF-8.
	 * 
	 * @return String
	 */
	public static String lerLinha(String mensagem) {
		imprimir(mensagem);
		return lerLinha();
	}

	/**
	 * Faz a leitura de texto digitado no prompt de comandos e retorna uma String no
	 * formato ISO-8859-1 Latin ou UTF-8.
	 * 
	 * @return String
	 */
	public static String lerLinha() {
		while (true) {
			try {
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				return br.readLine();
			} catch (IOException e) {
				System.out.println("Texto inválido, digite novamente...");
			}
		}
	}

	/**
	 * Imprime a mensagem enviada, faz a leitura do número digitado no prompt de
	 * comandos e retorna um int.
	 * 
	 * @return int
	 */
	public static int lerInteiro(String mensagem) {
		imprimir(mensagem);
		return lerInteiro();
	}

	/**
	 * Faz a leitura do número digitado no prompt de comandos e retorna um int.
	 * 
	 * @return int
	 */
	public static int lerInteiro() {
		while (true) {
			try {
				String linha = lerLinha();
				if (linha.isEmpty()) {
					return 0;
				}
				return Integer.parseInt(linha);
			} catch (NumberFormatException tExcept) {
				System.out.println("Inteiro inválido, digite novamente...");
			}
		}
	}

	/**
	 * Imprime a mensagem enviada, faz a leitura do número digitado no prompt de
	 * comandos e retorna um double.
	 * 
	 * @return double
	 */
	public static double lerDecimal(String mensagem) {
		imprimir(mensagem);
		return lerDecimal();
	}

	/**
	 * Faz a leitura do número digitado no prompt de comandos e retorna um double.
	 * 
	 * @return double
	 */
	public static double lerDecimal() {
		while (true) {
			try {
				String linha = lerLinha();
				if (linha.isEmpty()) {
					return 0;
				}
				return Double.parseDouble(linha);
			} catch (NumberFormatException e) {
				System.out.println("Decimal inválido, digite novamente...");
			}
		}
	}

	/**
	 * Faz a leitura do caractere digitado no prompt de comandos e retorna ele.
	 * 
	 * @return char
	 */
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static char lerChar(String mensagem) {
		imprimir(mensagem); // Imprime a mensagem antes de fazer a leitura, seguindo o padrão.
		return lerChar();
	}
	
	public static char lerChar() {
		while (true) {
			try {
				int valorLido = br.read(); // Lê o caractere.
				br.readLine(); // Limpa o buffer para remover qualquer sobra, como o caractere de nova linha.
				return (char) valorLido; // Retorna o caractere lido.
			} catch (IOException e) {
				System.out.println("Caractere inválido, digite novamente...");
			}
		}
	}	

	/**
	 * Faz uma pausa no processamento e pede para o usuário pressionar enter para
	 * continuar.
	 */
	public static void pressionarEnter() {
		System.out.print("Pressione ENTER para continuar...");
		lerLinha();
	}
}
