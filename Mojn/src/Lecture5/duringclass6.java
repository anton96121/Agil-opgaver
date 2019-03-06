package Lecture5;

class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

public class duringclass6 {
	
	public static void m(int i) throws MyException {
		if (i == 0) {
			// do something now idiot
			throw new MyException("fuck you agian, i has to be different from 0 noob");
		}
		System.out.println("You were lucky idiot");
	}
	
	public static void main(String[] args) {
		try {
		m(13454);
		m(0);
		} catch (MyException e) {
			System.err.print("You are an idiot:" + " ");
			e.printStackTrace();
			e.getMessage();
		}
	}
}
