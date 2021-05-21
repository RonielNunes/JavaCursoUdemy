package _4_ProcessamentoDeDadosEmJava;

public class Programa {

	public static void main(String[] args) {
		// Nesta parte é estudado o casting

		int a, b;
		double resultadoComCasting,resultadoSemCasting;
		a = 5;
		b = 2;
		
		resultadoComCasting = (double)a/b;
		resultadoSemCasting = a/b;
		System.out.println("Com casting: " + resultadoComCasting + " resultado sem casting: " + resultadoSemCasting);
	}

}
