package application;

import java.util.Locale;

import entities.Account;
import entities.People;
import entities.enums.AccountTipy;
import entitiesWayTwo.Account2;
import entitiesWayTwo.Cheking2;
import entitiesWayTwo.People2;
import entitiesWayTwo.Savings2;

public class Program {
	public static void main(String[] args) {
		//Create enities people and account. He have an account. (savings account conta poupança  and checking account conta corrente)
		
		Locale.setDefault(Locale.US);
		
		System.out.println("First way"); //way caminho, maneira
		People p1 = new People("Rob", 23, new Account(1, AccountTipy.valueOf("SAVINGS_ACCOUNT"),1400.0));
		People p2 = new People("Ana", 24, new Account(2, AccountTipy.CHEKING_ACCOUNT,200.0));
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println("Second way");
		
		//Pessoa interface contas tipo1 tipo 2
		People2 p21 = new People2("Rob", 18, new Savings2(3, 1921.0));
		People2 p22 = new People2("Rob", 18, new Cheking2(4, 1921.0));
		System.out.println(p21.toString());
		System.out.println(p22.toString());
		
	}
}
