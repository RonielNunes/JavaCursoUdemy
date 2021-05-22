package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// Vector de tipo primitivo
		int n = 4;
		Locale.setDefault(Locale.US);
		double[] vector = new double[n];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < n; i++) {
			System.out.print("Digite o valor para preencher o vetor: ");
			vector[i] = sc.nextDouble();
		}

		for (int i = 0; i < n; i++) {
			// System.out.println(vector);
			System.out.printf("i : %.2f \n", vector[i]);
		}
		// Vector de classes
		System.out.print("Digite o tamanho do vetor: ");
		int size = sc.nextInt();
		
		Product[] vect = new Product[size];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			Double price = sc.nextDouble();
			vect[i] = new Product(name,price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum+=vect[i].getPrice();
		}
		double svg = sum / size;
		
		System.out.println("Average Price: " + svg);

		sc.close();
	}

}
