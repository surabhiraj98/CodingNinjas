/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/
import java.util.Scanner;
public class ComplexNumbers {
	// Complete this class
	private int real;
	private int imaginary;
	private int newReal;

	public int getNewReal() {
		return newReal;
	}

	public void setNewReal(int newReal) {
		this.newReal = newReal;
	}

	public int getNewimaginary() {
		return newimaginary;
	}

	public void setNewimaginary(int newimaginary) {
		this.newimaginary = newimaginary;
	}

	private int newimaginary;

	public ComplexNumbers(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	public void plus(ComplexNumbers c2) {

		newReal = this.real + c2.real;
		newimaginary = this.imaginary + c2.imaginary;
	}

	public void print() {

		System.out.println(getNewReal() + " " + "+" + " " + "i" + getNewimaginary());
	}

	public void multiply(ComplexNumbers c2) {
		int newReal = (this.real * c2.real) - (this.imaginary * c2.imaginary);
		setNewReal(newReal);
		int newimaginary = ((this.real * c2.imaginary)) + ((this.imaginary * c2.real));
		setNewimaginary(newimaginary);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();

		if (choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		} else if (choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		} else {
			return;
}
}
}

