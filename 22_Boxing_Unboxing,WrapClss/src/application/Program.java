package application;

public class Program {

	public static void main(String[] args) {
		/*
		 * Boxing • É o processo de conversão de um objeto tipo valor para um objeto
		 * tipo referência compatível
		 */
		int x = 20;
		Object obj = x;
		/*
		 * Unboxing • É o processo de conversão de um objeto tipo referência para um
		 * objeto tipo valor compatíve
		 */
		int y = (int) obj;
		/*
		 * Wrapper classes 
		 * • São classes equivalentes aos tipos primitivos • Boxing e
		 * unboxing é natural na linguagem • Uso comum: campos de entidades em sistemas
		 * de informação (IMPORTANTE!) • Pois tipos referência (classes) aceitam valor
		 * null e usufruem dos recursos OO
		 */
		Integer xx = 20;
		int z = xx*2;
	}

}
