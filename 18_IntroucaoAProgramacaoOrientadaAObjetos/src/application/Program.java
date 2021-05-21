package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.next();

		System.out.print("Price: ");
		product.price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("Product data: " + product.toString()); 
		
		System.out.print("Enter the number of product to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Update data: " + product.toString());
		
		System.out.print("Enter the number of product to be removed from strock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Update data: " + product.toString());
		
		
		

		sc.close();
	}

}