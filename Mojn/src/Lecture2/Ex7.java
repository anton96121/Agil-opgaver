package Lecture2;
/*
 Exercise J2.7.Create a class with two (overloaded) constructors. 
 Using this, call the second constructor inside the first one
 */
class mojnehund {
	
	private String name;
	private int age;
	
	public mojnehund(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public mojnehund(String name) {
		this(name, 1);
	}
	public mojnehund() {
		this("gadekryds -> dræb den");
	}

	public void print() {
		System.out.println(name + ": "+ age);
	}
}
public class Ex7 {
	public static void main(String[] arg) {
		mojnehund lab = new mojnehund();
		lab.print();
	}
	

}
