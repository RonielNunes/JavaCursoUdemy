package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented?");
		int size = sc.nextInt();
		Student[] room = new Student[10];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Rent#"+(i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();			
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			room[roomNumber] = new Student(name,email, roomNumber);
		}
		
		for (int i = 0; i < room.length; i++) {
			if(room[i] != null) {
				System.out.println(room[i].toString());
			}
			
		}
		
		sc.close();
	}

}
