package Lecture2;

/*
Exercise J2.9.Prove that the base-class constructors are (a)
always called and(b)called before derived-class constructors.
*/
class Employee23{
	protected String name;
	protected int salary;
	
	public Employee23(String name,int salary) {
		this.name = name;
		this.salary = salary;
		System.out.println("sss");

	}
	public Employee23(String name) {
		this(name,0);
		
	}
	
	public Employee23() {
		this("UNKOWN");
	}

	
	public void print() {
		System.out.println(name + ": " + salary);
		
	}
}
class Manager1 extends Employee23{
	private String title;
	private Employee23[] employees;
	
	public Manager1(String name, int salary , String title) {
		super(name,salary);
		System.out.println("ss");

		
		this.title = title;
		
	}
	public void print() {
		System.out.println(title + ": " + name +" : " + salary);
	}

	} 


public class Ex8 {
	public static void main(String[] args) {
		Manager1 m = new Manager1("Bob",1000,"leader");
		m.print();


}
}
//From the print statements one can see that the base is called first (employee) and then the manager is called
