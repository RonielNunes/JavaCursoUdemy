package aplicacao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;
import entidades.Pessoa;
import entidades.Professor;
import entidades.enums.Status;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Pessoa> registro = new ArrayList<>();
		int quantidade = 1;
		
		for (int i = 0; i < quantidade; i++) {

			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Status: ");
			String status = sc.nextLine();
			Status convertido = Status.valueOf("ALUNO");
			
			
			if(status.equals("ALUNO")) {
				Aluno aluno = new Aluno(nome, idade, convertido);
				registro.add(aluno);
			}else if(status.equals("PROFESSOR")) {
				Professor professor =  new Professor(nome, idade, convertido);
				registro.add(professor);
			}
			System.out.println();
		}
		
		for (int i = 0; i < registro.size(); i++) {
			registro.get(i).toString();
			System.out.println("q");
		}
	}
}
