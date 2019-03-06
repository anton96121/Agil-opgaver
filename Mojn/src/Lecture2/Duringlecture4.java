package Lecture2;

class employee2{
	private String name;
	private double salary;
	
	public employee2(String name, double salary) {
		this.name = name;
		this.salary = salary; // this way we create an employee even when the name and salary is private.
	}
	public employee2(String name) {
		this(name, -1);// this way we create an employee only giving a name and the salary will be default 10
	}
	public void print() {
		System.out.println(name + ": "+ salary);
	}
}

public class Duringlecture4 {
	
	public static void main(String[] args) {
		employee2 BOSS = new employee2("Boss Boss", 300000000);
		//employee2 idiot = new employee2(); // because the employee function to construct a new employee demands two inputs this is illegal.
		// This can be fixed by implementing a following method in class employee2
		// public employee2() {
		//       this("Unknown");
		//  }
		BOSS.print();
	}

}
