import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
		
		double primeiroValor;
		double segundoValor;
		
		double soma;
		double subtracao;
		double divisao;
		double multiplicacao;
		
		System.out.println("Digite o primeiro Valor: ");
		primeiroValor = leitor.nextDouble();
		System.out.println("Digite o segundo Valor");
		segundoValor = leitor.nextDouble();
		
		soma = primeiroValor + segundoValor;
		subtracao = primeiroValor - segundoValor;
		divisao = primeiroValor / segundoValor;
		multiplicacao = primeiroValor * segundoValor;
		System.out.println("Soma " + soma);
		System.out.println("Subtração " + subtracao);
		System.out.println("Divisão " + divisao);
		System.out.println("multiplicação " + multiplicacao);
		
		leitor.close();
	}

}
