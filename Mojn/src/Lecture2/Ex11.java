package Lecture2;

class Root {
	Root() {
		System.out.println("I'm class Root");	
	}
	Component3 c3 = new Component3();
	Component2 c2 = new Component2();
	Component1 c1 = new Component1();
}

class Component1{
	Component1() {
		System.out.println("I'm class Component1");	
	}
}

class Component2{
	Component2() {
		System.out.println("I'm class Component2");	
	}
}

class Component3{
	Component3() {
		System.out.println("I'm class Component3");	
	}
}
class Stem extends Root {
	Stem() {
		System.out.println("I'm class Stem");	
	}
	Component1 c1 = new Component1();
	Component2 c2 = new Component2();
	Component3 c3 = new Component3();
}


public class Ex11 {
	public static void main(String[] arg) {
		Stem s = new Stem();
	}
}
