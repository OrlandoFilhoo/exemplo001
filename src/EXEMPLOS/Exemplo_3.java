package EXEMPLOS;

import java.util.Scanner; //importação de biblioteca

public class Exemplo_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in); //criando objeto
		
		System.out.println("Digite sua idade: ");
		int numero = scanner.nextInt();
		
		if (numero >= 10 && numero <= 20) {
			System.out.println("O valor está entre 10 e 20");
		}else {
			System.out.println("O valor não está entre 10 e 20");
		}
	}

}
