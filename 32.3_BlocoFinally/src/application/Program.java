package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

//		Bloco finally
//		try {
//		}
//		catch (ExceptionType e) {
//		}
//		finally {
//		}
//		� � um bloco que cont�m c�digo a ser executado independentemente de ter
//		ocorrido ou n�o uma exce��o.
//		� Exemplo cl�ssico: fechar um arquivo, conex�o de banco de dados, ou outro
//		recurso espec�fico ao final do processamento.

		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
