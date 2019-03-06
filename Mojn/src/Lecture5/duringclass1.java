package Lecture5;

enum CardinalPoints {
	N("North"), S("South"), E("East"), W("West");
	
	private String extendName;
	
	private CardinalPoints (String extendName) {
		this.extendName = extendName;
	}
	
	// Vi er nød til at overwrite toString ellers printer man bare N og ikke North
	public String toString() {
		return extendName;
	}
	
}

public class duringclass1 {
	
	public static void main(String[] args) {
		CardinalPoints cp = CardinalPoints.N;
		
		System.out.println(cp);
		
		for (CardinalPoints c : CardinalPoints.values()) {
			System.out.println(c);
		}
		
		CardinalPoints c = CardinalPoints.valueOf("N");
		
		System.out.println(c);

		
		
	}

}
