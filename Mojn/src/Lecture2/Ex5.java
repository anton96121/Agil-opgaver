package Lecture2;
/*
 Exercise J2.5.Modify the previous exercise so that two of the overloaded methods
 have two arguments (of two different types), but in reversed order relative
 to each other. Verify that this works.
 */


class Dog2 {
	
	void bark(double gg, int mojn) {
		System.out.println("double int barking");
	}
	void bark(int mojn, double gg) {
		System.out.println("int double barking");
	}

}
public class Ex5 {
	public static void main(String[] arg) {
		Dog2 hund = new Dog2();
		hund.bark(1.053, 4);
		hund.bark(1, 4.563);

	}

}
