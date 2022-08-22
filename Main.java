package parOuImpar;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		pergunta();
	}

	public static void pergunta() {
		System.out.println("Digite um numero");
		Scanner teclado = new Scanner(System.in);
		String numeroTemporaria = teclado.next();
		int numero = Integer.parseInt(numeroTemporaria);
		System.out.println("Par ou impar [P/I]");
		String opcaoTemporaria = teclado.next();
		char opcao = opcaoTemporaria.charAt(0);
		verificacao(numero, opcao);
	}
	
	public static void verificacao(int numero, char opcao) {
		Random random = new Random();
		Scanner teclado = new Scanner(System.in);
		int numeroAleatorio = random.nextInt(11);
		if((numero + numeroAleatorio) % 2 == 0 && opcao == 'P') {
			System.out.println("Voce jogou "+ numero + " e o bot jogou "+ numeroAleatorio + ".\nPortanto, voce ganhou!");
			
		}else if((numero + numeroAleatorio) % 2 != 0 && opcao == 'I') {
			System.out.println("Voce jogou "+ numero + " e o bot jogou "+ numeroAleatorio + ".\nPortanto, voce ganhou!");
			
		}else {
			System.out.println("Voce jogou " + numero + " e o bot jogou "+ numeroAleatorio + ".\nPortanto, voce perdeu...");
		}
			
		System.out.println("Quer jogar novamente? [S/N]");
		String conf = teclado.next();
		char confirmacao = conf.charAt(0);
		if(confirmacao == 'S' || confirmacao == 's') {
			pergunta();
		}else {
			System.out.println("Saindo...");
		}
	}
}
