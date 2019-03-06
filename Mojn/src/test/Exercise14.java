package test;

public class Exercise14 {
	public static void main(String[] args) {
		int tal1 = 0;
		System.out.println(1);
		for (int j=0; j<1000; j++) {
			tal1 = tal1+1;
			innerloop: for (int i=2;i<=tal1;i++) {
				if (i==tal1) {
					System.out.println(tal1);
				}
				if ((tal1%i)==0) {
					break innerloop;
				}
			}
			
		}
	}
}
