package Lecture2;
/*
Exercise J2.8.Create a class with public ,private, protected, and package-access
fields and method members. Create an object of this class and see what
kind of compiler messages you get when you try to access all the class members.
*/

public class Ex9 {
	public static void main(String[] arg) {
		retriver lab = new retriver();

		
		lab.changeAge(10);
		lab.name = "Molly";
		lab.cpr = 1010101010;
		lab.info();
		
	}
	

}
