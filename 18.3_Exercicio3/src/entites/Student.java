package entites;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	protected boolean status;
	
	public double totalSum() {
		return (this.nota1 + this.nota2 + this.nota3);
	}
	
	public String check() {
		if(this.totalSum() > 60) {
			this.status = true;
			return ("PASS");
		}else {
			this.status = false;
			return ("FAILED");
		}
	}
	
	public String lack() {
		if(status) {
			return "";
		}else {
			return "MISSING : " + (-1*(this.totalSum() - 60)) + " POINTS";
		}
	}
 
}
