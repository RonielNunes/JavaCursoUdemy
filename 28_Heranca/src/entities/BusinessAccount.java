package entities;

public final class BusinessAccount extends Account{
	private  Double loanLimit;
	
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public final void loan(Double amount) {
		if(amount <= loanLimit) {
			deposit(amount);
			//modificador de aceso protected
			//Balance é da super classe mas não pode ser acessadpo por ser private
			//logo para poder acessar ela devemos colocar "protected".
			//balanceWithAcess = 110.0; //Podemos acessar agora
		}
	}

}
