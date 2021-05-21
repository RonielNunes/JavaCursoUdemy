package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		//sysout + ctrl + espaco = System.out.println();
		//ctrl + shift + f = Identação e correção em espaçamento
		//ctrl + shift + o = imports
		//ctral + s = salvar
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle witdh and heilht: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println("Area : " + rectangle.area());
		System.out.println("Perimeater: " + rectangle.perimeter());
		System.out.println("Diagonal : " + rectangle.diagonal());

	}

}
