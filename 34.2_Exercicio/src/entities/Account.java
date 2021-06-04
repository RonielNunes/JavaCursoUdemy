package entities;

import entities.enums.AccountTipy;

public class Account {
	private Integer	id;
	private AccountTipy tipy;
	private Double balance;
	
	public Account(Integer id, AccountTipy tipy, Double balance) {
		this.id = id;
		this.tipy = tipy;
		this.balance = balance;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getAccountTipy() {
		return tipy.toString(); //Enum to string format
	}
	
	public void setAccountTipy(AccountTipy tipy) {
		this.tipy = tipy;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "ID : " + id + " Tipy: " + tipy + " balance: " + String.format("%.2f", balance);
	}
}
