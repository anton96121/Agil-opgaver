package Lecture2;

/*
 Exercise J2.3. Add  an  overloaded  constructor  to  the  previous  exercise  that
 takes a String argument and prints it along with your message.
 */

class mojn2000 {
	String s;
	void print() {
		this.s = "mojne mand";
		System.out.println(s);
	}
	void print(String gg) {
			this.s = "mojne mand" + " " + gg;
			System.out.println(s);
	}
}
public class Ex3 {
	public static void main(String[] arg) {
		mojn2000 a = new mojn2000();
		
		a.print();
		a.print("MOJNE");// Dette er overload hvor print metoden kan ikke tage et argument og tage en string som argument.
	}
}
