package test;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise15 {
	public static void main(String[] args) {
		while (true) {
			int tal1 = ThreadLocalRandom.current().nextInt(0, 100 + 1);
			if (tal1>=45 && tal1<=50) {
				System.out.println("You are in the illegeal interval");
					break;
			}
			System.out.println(tal1);
	
		
			
		}
	}
}
