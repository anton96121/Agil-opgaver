package Lecture2;

public class DuringClass2 {
	int i;
	
	public void changeDouble(double d) {
		d = 3.14;
	}
	
	public void changeObject(DuringClass2 param) {
		param.i = 42;
	}
	
	public static void main(String[] args) {
		DuringClass2 t = new DuringClass2();
		double val = 2.71;
		t.changeDouble(val);
		System.out.println(val);
		
		t.i = 0;
		t.changeObject(t);
		System.out.println(t.i);}
	}
	