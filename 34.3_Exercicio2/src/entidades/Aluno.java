package entidades;

import entidades.enums.Status;

public class Aluno extends Pessoa{
	
	protected String nome;
	protected Integer idade;
	protected Status status;
	
	public Aluno(String nome, Integer idade, Status status) {
		super(nome, idade, status);
	}
	
	@Override
	public String toString() {
		return "nome=" + nome + ", idade=" + idade + ", status=" + status;
	}
	
}
