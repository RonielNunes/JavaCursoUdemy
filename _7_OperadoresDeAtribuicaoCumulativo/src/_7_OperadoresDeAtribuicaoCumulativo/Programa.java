package _7_OperadoresDeAtribuicaoCumulativo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		//Operadores de atribui��o cumulativa
		int a = 123, b = 123;
		
		a += b;
		a -= b;
		a *=b;
		a /=b;
		a %=b;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minutos = sc.nextInt();
		double conta = 50.0;
		if (minutos > 100) {
		conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		sc.close();

	}

}
