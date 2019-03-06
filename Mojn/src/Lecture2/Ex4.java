package Lecture2;
/*
 Exercise J2.4.Create a class called Dog with an overloaded bark() method.
 This method should be overloaded based on various primitive data types, and
 print different types of barking, howling, etc., depending on which overloaded 
 version is called. Write a main() that calls all the different versions.
 */

class Dog {
	
	void bark() {
		System.out.println("null barking");
	}
	void bark(int i) {
		System.out.println("int barking");
	}
	void bark(float fl) {
		System.out.println("float barking");
	}

	void bark(double d) {
		System.out.println("double barking");
	}



}
public class Ex4 {
	public static void main(String[] arg) {
		Dog hund = new Dog();
		hund.bark();
		hund.bark(1);
		hund.bark(1.0F);
		hund.bark(234.342);
	}

}
