package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee teste;
		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1));

			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasID(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salaty: ");
			Double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary));
			System.out.println();
		}

		System.out.print("Enter the employee id that will have salary increase : ");
		Integer id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) { //Se igual a null
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			Double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}

	// fun��o para verificar se tem id na list
	public static boolean hasID(List<Employee> list, Integer id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
