package entities;

public class People {
	private String name;
	private Integer age;
	private Account account;
	//construtor da classe
	public People(String name, Integer age, Account account) {
		this.name = name;
		this.age = age;
		this.account = account;
	}
	//métodos acessores aos atributos
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "NAME: " + name + " AGE: " + age + " |ACCOUNT= " + account.toString();
	}
}
