package Atividade_Prof;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		SistemaAluno aluno1= new SistemaAluno("Maria", 20, "123.123.123-12", "1");
		
		int i = 0;
		
		while(i != 3) {
			System.out.println("Digite uma opção: ");
			System.out.println("1 - Modificar Informação: ");
			System.out.println("2 - Consultar Aluno: ");
			
			i = scanner.nextInt();
			
			if (i == 1) {
				System.out.println("Qual informação quer alterar 1 - Nome / 2 - Idade / 3 - CPF / 4 - Sala");
				int opcao2 = scanner.nextInt();
				if (opcao2 == 1) {
					System.out.println("Digite o novo nome: ");
					String novoNome = scanner.next();
					aluno1.setNome(novoNome);
					System.out.println("O nome foi modificado para: "+aluno1.getNome());
					
				}else if(opcao2 == 2) {
						
						int novaIdade = scanner.nextInt();
						aluno1.setIdade(novaIdade);
						System.out.println(aluno1.getIdade());
		
					}	
						
				}		
						
						
						
						
		}
				
	}
			
}