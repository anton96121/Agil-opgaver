package test;

public class Exercise18 {
	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
		int j = 1;
		System.out.println(j);
		for (int k = 0; k<20; k++) {
			i=i+j;
			System.out.println(i);
			j=i+j;
			System.out.println(j);
		}
	}
}
