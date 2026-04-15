package files;

import java.util.Scanner;

public class Home {
	Scanner scanner = new Scanner(System.in);
	public int a = 10;
	private int b = 20;
	protected double c = 30;
	double d = 40; //default access modifier
	
	public void display() {
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
	}
	public void set_a(int a) {
		this.a = a;
	}
	private void set_b(int b) {
        this.b = b;
    }
	protected void set_c(double c) {
		this.c = c;
	}
	void set_d(double d) {
		this.d = d;
	}
	public int add(int a, int b) {
        return a+b;
    }
	public double add(double c, int d) {
		return c + d;
	}
	
}
