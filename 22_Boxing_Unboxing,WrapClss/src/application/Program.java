package application;

public class Program {

	public static void main(String[] args) {
		/*
		 * Boxing � � o processo de convers�o de um objeto tipo valor para um objeto
		 * tipo refer�ncia compat�vel
		 */
		int x = 20;
		Object obj = x;
		/*
		 * Unboxing � � o processo de convers�o de um objeto tipo refer�ncia para um
		 * objeto tipo valor compat�ve
		 */
		int y = (int) obj;
		/*
		 * Wrapper classes 
		 * � S�o classes equivalentes aos tipos primitivos � Boxing e
		 * unboxing � natural na linguagem � Uso comum: campos de entidades em sistemas
		 * de informa��o (IMPORTANTE!) � Pois tipos refer�ncia (classes) aceitam valor
		 * null e usufruem dos recursos OO
		 */
		Integer xx = 20;
		int z = xx*2;
	}

}
