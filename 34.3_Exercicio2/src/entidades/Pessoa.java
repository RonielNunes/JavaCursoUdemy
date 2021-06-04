package entidades;

import java.util.ArrayList;
import java.util.List;

import entidades.enums.Status;

public class Pessoa implements IPessoa{
	
	protected String nome;
	protected Integer idade;
	protected Status status;
	
	public Pessoa(String nome, Integer idade, Status status) {
		this.nome = nome;
		this.idade = idade;
		this.status = status;
	}
	
	@Override
	public void adicionar() {
		System.out.println("Adicionado no sistema");
	}

	@Override
	public void excluir() {
		System.out.println("Excluir");
		
	}

	@Override
	public void pesquisar() {
		System.out.println("Pesquisando");
		
	}

	@Override
	public String toString() {
		return "nome=" + nome + ", idade=" + idade + ", status=" + status;
	}
	
	
}
