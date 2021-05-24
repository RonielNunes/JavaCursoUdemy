package entities;
//N�o permite que tenham subs classes da SavingAccount, n�o podem herda ela
public final class SavingsAccount extends Account{
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	//Sobreposi��o
	@Override
	public void withdraw(Double amount) {
		balance -=amount;
		super.withdraw(amount);
		balance -=2;
	}
}
