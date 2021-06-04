package entidades;

import entidades.enums.Status;

public class Professor extends Pessoa{
	protected String nome;
	protected Integer idade;
	protected Status status;
	public Professor(String nome, Integer idade, Status status) {
		super(nome, idade, status);
	}
	@Override
	public String toString() {
		return "nome=" + nome + ", idade=" + idade + ", status=" + status;
	}
}
