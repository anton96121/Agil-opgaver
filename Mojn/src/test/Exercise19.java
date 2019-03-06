package test;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise19 {
	public static void main(String[] args) {
		for (int i = 0; i<40; i++) {
			int k = ThreadLocalRandom.current().nextInt(0, 1 + 1);
			System.out.println(k);
			
		}
	}
}
