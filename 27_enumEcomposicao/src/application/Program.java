package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
//		new Date() pega a hora atual 
		Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
		
		OrderStatus orderOne = OrderStatus.DELIVERED;
		OrderStatus orderTwo = OrderStatus.valueOf("DELIVERED"); //Convers�o de String para Enum Receber o valor atrav�s de string 
		
		System.out.println(orderOne);
		System.out.println(orderTwo);
		System.out.println(order);
		
	}

}
