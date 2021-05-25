package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
//		Estrutura try-catch
//		� Bloco try
//		� Cont�m o c�digo que representa a execu��o normal do trecho de c�digo que
//		pode acarretar em uma exce��o
//		� Bloco catch
//		� Cont�m o c�digo a ser executado caso uma exce��o ocorra
//		� Deve ser especificado o tipo da exce��o a ser tratada (upcasting � permitido)

		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		System.out.println("End of program");
		sc.close();
	}

}
