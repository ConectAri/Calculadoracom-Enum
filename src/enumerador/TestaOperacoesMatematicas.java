package enumerador;
import java.util.Scanner;

/*
Calculadora com Enum

Escreva um Enum que represente as quatro operações matemáticas: somar,subtrair,multiplicar
e dividir.
O Enum deve ter um construtor que receba o símbolo da operação(+, - , *, /)
Sobrescreva o método toString que retorne somente o símbolo da operação.
Implemente um método abastrato com a seguinte assinatura double executarOperacao(double x, double y).
 Cada opção do Enum deve implementar esse método realizando a operação de acordo com sua descrição.
Escreva um método main para teste que realize todas as operações do Enum.
Dica: você pode usar o método values para iterar o Enum e executar todas as operações.
*/

public class TestaOperacoesMatematicas {

	public static void main(String[] args) {		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("------OPERAÇÕES MATEMÁTICAS------");
		System.out.println("---------------------------------");
		System.out.println("Digite o primeiro número:");
		double primeiroNumero = leia.nextDouble();
		System.out.println("Digite o segundo número:");
		double segundoNumero = leia.nextDouble();
		System.out.println();

		for (OperacoesMatematicas operacoes : OperacoesMatematicas.values()) {
		System.out.println(primeiroNumero + " " + operacoes + " " + 
		segundoNumero + " =" + String.format(" %.2f ", operacoes.executarOperacao(primeiroNumero, segundoNumero)));

		}

		leia.close();
		

	}

}
