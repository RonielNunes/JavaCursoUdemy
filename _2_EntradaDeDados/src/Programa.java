import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int inteiro = teclado.nextInt();
		float pontoFlutuante = teclado.nextFloat();
		double pontoFlutunate2 = teclado.nextDouble();
		String palavra = teclado.next();
		String fraseComEspaco = teclado.nextLine();
		//Entre outros...
		
		teclado.close();
 
	}

}
