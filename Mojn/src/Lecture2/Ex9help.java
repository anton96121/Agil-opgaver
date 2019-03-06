package Lecture2;

public class Ex9help {
	 protected String name;
	 public int cpr;

	}

class retriver extends Ex9help {
	private int age;
	 void changeAge(int age) {
			this.age = age;
		}
	 public void info() {
		 System.out.print("My dog's name is " + name + " and it's cpr is " + cpr + ". It is  " + age + " old.");
	 }

		
	}

