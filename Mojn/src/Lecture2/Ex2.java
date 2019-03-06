package Lecture2;
/*
 Exercise J2.2.
 Create a class with a default constructor (one that takes no arguments) that prints a message. 
 Create an object of this class
 */

class mojne2000 {
	void print() {
		System.out.println("mojne mand");
	}
}
public class Ex2 {
	public static void main(String[] arg) {
		mojne2000 a = new mojne2000();
		
		a.print();
	}
}
