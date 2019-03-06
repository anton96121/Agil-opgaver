package Lecture5;

public class duringclass5 {
	
	
public static void main(String[] args) {
	String[] s = {"test1", "test2", "test3"};
	int i = 0;
	
	while(i<4) {
		try {
			
		System.out.println(s[i]);
		} catch (ArrayIndexOutOfBoundsException e) { // Aldrig catch array fejl. Dem skal man håndtere ordenligt. Det samme med null exceptions
			System.err.print("You are idiot:" + " ");
			e.printStackTrace();
		}
		i++;
	}
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	System.err.println("                                                     ");
	System.err.println("                                                     ");
	System.err.println("                                                     ");
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||       |||||||||||||||||||||||||");
	
	
	
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.err.println("|||||||||||||||||||||||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||          ||||||||||||||||||");
	System.err.println("|||||||||||||||||          ||||||||||||||||||");
	System.err.println("|||||||||||||||||          ||||||||||||||||||");
	System.err.println("|||||||||||                       |||||||||||");
	System.err.println("|||||||||||                       |||||||||||");
	System.err.println("|||||||||||                       |||||||||||");
	System.err.println("|||||||||||                       |||||||||||");
	System.err.println("|||||||||||||||||          ||||||||||||||||||");
	System.err.println("|||||||||||||||||          ||||||||||||||||||");
	System.err.println("|||||||||||||||||          ||||||||||||||||||");
	System.err.println("|||||||||||||||||||||||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||||||||||||||||||||||||||");
	System.err.println("|||||||||||||||||||||||||||||||||||||||||||||");
	System.err.println("");
	System.err.println("Made by Anton Ruby Larsen AKA World Champ in ASCII ART");
}
}
