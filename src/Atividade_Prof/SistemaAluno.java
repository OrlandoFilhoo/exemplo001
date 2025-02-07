package Atividade_Prof;

public class SistemaAluno {

	//Variaveis
	private	String nome;
	private	int idade;
	private	String cpf;
	private String sala;
	
	//Metodo construtor
	public SistemaAluno(String nome, int idade, String cpf, String sala) {
		// TODO Auto-generated constructor stub
		this.setNome(nome);
		this.setIdade(idade);
		this.setCpf(cpf);
		this.setSala(sala);
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}
}

