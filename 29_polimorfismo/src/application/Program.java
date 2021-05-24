package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsurcedEmployee;

public class Program {
	public static void main(String[] args) {
//		Polimorfismo
//		Em Programa��o Orientada a Objetos, polimorfismo � recurso que
//		permite que vari�veis de um mesmo tipo mais gen�rico possam
//		apontar para objetos de tipos espec�ficos diferentes, tendo assim
//		comportamentos diferentes conforme cada tipo espec�fico.
//		Account x = new Account(1020, "Alex", 1000.0);
//		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
//		x.withdraw(50.0);
//		y.withdraw(50.0);
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List <Employee> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #"+(i+1)+ "data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours? ");
			Integer hours = sc.nextInt();
			
			System.out.print("Value per Hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if(ch == 'y') {
				System.out.print("Additional Charge: ");
				Double additionalCharge = sc.nextDouble();
				
				list.add(new OutsurcedEmployee(name, hours, valuePerHour, additionalCharge));
			}else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		for(Employee obj : list) {
			System.out.println(obj.getName() + " - $ " + String.format("%.2f", obj.payment()));
		}
		
	}
}
