package Exemplo1;

import java.util.Scanner;

public class exemplo6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a nota 1: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		double nota2 = scanner.nextDouble();
		
		double resultado = (nota1 + nota2) / 2;
		
		System.out.println("A média é: " + resultado);
		
	}

}
