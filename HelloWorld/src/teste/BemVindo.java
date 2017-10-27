package teste;

import java.util.Scanner;

public class BemVindo {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		sc.close();
		System.out.println("Seja bem vindo, " + nome + "!");
	}

}
