package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][] matriz = new int[n][m];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == x) {
					System.out.println("Position: " + i + "," + j);
					if(i > 0) {
						System.out.println("Top: " + matriz[i-1][j]);
					}
					if(j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if(i+1 < n) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
					if(j+1 < m) {
						System.out.println("Rigth: " + matriz[i][j+1]);
					}
				}
			}
		}

	}

}
