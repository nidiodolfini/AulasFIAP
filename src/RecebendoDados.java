import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, escreva seu nome: ");
		String nome = leitor.nextLine();
		System.out.println(nome);
		int idade = leitor.nextInt();
		System.out.println(idade);
		
		leitor.close();
	}

}
