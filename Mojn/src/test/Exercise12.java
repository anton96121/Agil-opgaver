package test;
import java.util.concurrent.ThreadLocalRandom;
public class Exercise12 {
	public static void main(String[] args) {
		for (int i=0; i<=25; i++) {
			int tal1 = ThreadLocalRandom.current().nextInt(0, 100 + 1);
			int tal2 = ThreadLocalRandom.current().nextInt(0, 100 + 1);
			String mojn = new String();
			if (tal1>tal2) {
				mojn = "greater";
			}
			if (tal1<tal2) {
				mojn = "less";
			}
			if (tal1==tal2) {
				mojn = "equal";
			}
			System.out.println(tal1 + " is " + mojn + " than " + tal2);
		}
	}

	

}
