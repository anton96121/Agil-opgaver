package Lecture2;
class A {
	A() {
		System.out.println("I'm class A");
	}
}
class B{
	B() {
		System.out.println("I'm class B");	
	}
	
}

class C extends A {
	B b = new B();
}
public class Ex10 {
	public static void main(String[] arg) {
		C c = new C();
	}
}
