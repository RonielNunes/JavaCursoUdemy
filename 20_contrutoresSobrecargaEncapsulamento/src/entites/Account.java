package entites;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;

	// Sobrecargar criar mais de um construtor com parametros diferentes
	// Construtores
	public Account() {

	}

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(balance);
	}

	public Account(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name; // Podemos omitir o campo balance, ele será iniciado como 0.0 automaticamente
	}

	// Métodos acessores

	public String getName() {
		return name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void deposit(double value) {
		this.balance += value;
	}

	public void withdraw(double value) {
		this.balance -= (value + 5);
	}
	
	public String toString() {
		return ("Account: " + this.accountNumber + ", Holder: " + this.name + ", Balance: $ " + String.format("%.2f",balance));
	}

}
