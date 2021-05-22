package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int accountNumber;
		String name, option;
		double value;
		Account account;
		
		System.out.print("Enter account number:  ");
		accountNumber = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		name = sc.nextLine();
		
		System.out.print("Is there in the initial deposit (y/n)? ");
		option = sc.next();
		
		if(option.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			value = sc.nextDouble();
			account = new Account(accountNumber, name, value);
		}else {
			account = new Account(accountNumber, name);
		}
		
		System.out.println("Account data: ");
		System.out.println(account.toString());
		
		System.out.print("Enter a deposit value: ");
		value = sc.nextDouble();	
		account.deposit(value);
		System.out.println(account.toString());
		
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		account.withdraw(value);
		System.out.println(account.toString());
		
		sc.close();
	}

}
