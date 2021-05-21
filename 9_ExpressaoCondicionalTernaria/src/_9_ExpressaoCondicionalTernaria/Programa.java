package _9_ExpressaoCondicionalTernaria;

public class Programa {

	public static void main(String[] args) {
		double preco = 34.5;
		//( condição ) ? valor_se_verdadeiro : valor_se_falso
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
	}

}
