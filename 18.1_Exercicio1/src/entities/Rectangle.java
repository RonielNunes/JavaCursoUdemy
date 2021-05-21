package entities;

public class Rectangle {
	public double width;
	public double height;

	public double area() {
		return this.height * this.width;
	}

	public double perimeter() {
		return ((2 * this.height) + (2 * this.width));
	}

	public double diagonal() {
		return Math.sqrt((Math.pow(this.width, 2)) + (Math.pow(this.height, 2)));
	}
}
