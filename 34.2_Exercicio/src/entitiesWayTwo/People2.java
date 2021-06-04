package entitiesWayTwo;

public class People2 {
	private String name;
	private Integer age;
	private Account2 account;
	
	public People2(String name, Integer age, Account2 account) {
		this.name = name;
		this.age = age;
		this.account = account;
	}

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

	public Account2 getAccount() {
		return account;
	}

	public void setAccount(Account2 account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", account=" + account.toString();
	}
	
	
	
}
