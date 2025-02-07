package Exemplo1;

import java.util.Scanner;

public class exemplo3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade =  scanner.nextInt();
		boolean resultado = (idade>=13) && (idade <= 19);
		
		System.out.println("A idade do usuário é: " + resultado);

	}

}
