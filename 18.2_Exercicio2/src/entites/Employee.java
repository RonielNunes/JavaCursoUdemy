package entites;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSlaray() {
		return (this.grossSalary - this.tax);
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary *=((100+percentage)/100);
	}
	
	public String toString() {
		return (this.name + ", " + String.format("%.2f", this.netSlaray()));
	}
}
