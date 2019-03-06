package Lecture2;
class mojnehund22 {
	
	private String name;
	private int age;
	private int cpr;
	
	public mojnehund22(String name, int age, int cpr) {
		this.name = name;
		this.age = age;
		this.cpr = cpr;
	}
	public mojnehund22(String name, int age) {
		this(name, age, -342);
	}
	public mojnehund22(String name) {
		this(name,12);
	}
	public void print() {
		System.out.println(name + age + "   " + cpr);
	}
}

class mojnehund23 extends mojnehund22 {
	public mojnehund23() {
		super("hunde");

	}


	
}
public class Ex12 {
	public static void main(String[] arg) {
		mojnehund23 a = new mojnehund23();
		a.print();
	}
	
}
