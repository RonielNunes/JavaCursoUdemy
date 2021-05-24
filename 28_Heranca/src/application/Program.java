package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Account acc = new Account(1,"a",0.0);
		BusinessAccount bacc = new BusinessAccount(2, "b", 0.0, 500.0);
		
		//UPCASTING -- SUPER CLASSE RECENDENDO SUB CLASSES
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(3, "c", 0.0, 200.0);
		Account acc3 = new SavingsAccount(4, "d", 0.0, 0.001);
		
		//DOWCASTING -- SUBCLASSES RECEBENDO SUPERCLASSE
		
		//acc4.loan()
		BusinessAccount acc4 =(BusinessAccount) acc2; //Neste caso tem que fazer o cast manual
		acc4.loan(100.0);
		//BusinessAccount acc5 = (BusinessAccount) acc3; //Gera problema ao executar pois n pode
		//Como evitar o erro
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Pode realizar o casting");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Pode realizar o casting sem erro");
		}
	}
}
