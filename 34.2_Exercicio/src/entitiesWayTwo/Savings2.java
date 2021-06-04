package entitiesWayTwo;

import entities.enums.AccountTipy;

public class Savings2 implements Account2{
	private Integer id;
	private AccountTipy tipy;
	private Double balance;
	
	
	
	public Savings2(Integer id, Double balance) {
		createAccount(id,balance);
	}

	@Override
	public void createAccount(Integer id, Double balance) {
		this.id = id;
		this.balance = balance;
		this.tipy = AccountTipy.SAVINGS_ACCOUNT;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AccountTipy getTipy() {
		return tipy;
	}

	public void setTipy(AccountTipy tipy) {
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
		return "id=" + id + ", tipy=" + tipy + ", balance=" + String.format("%.2f", balance);
	}
	
	
}
