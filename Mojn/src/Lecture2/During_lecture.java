package Lecture2;

class Employee {
	String name;
	String job;
	String department;
	
	void print() {
		System.out.println(name + " is " + job + " in " + department);
	}
}

class MyDate {
	int day, month, year;
	
	void tomorrow() {
		
	}
}



public class During_lecture {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.job = "Mojne mand";
		e.name = "Elron";
		e.department = "rap";
		
		
		Employee k = new Employee();
		k.job = "Graver";
		k.name = "Hundehovede";
		k.department = "Vej og park";
		
		e.print();
		k.print();
	}
}
