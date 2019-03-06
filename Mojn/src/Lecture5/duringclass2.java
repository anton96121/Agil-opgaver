package Lecture5;

class Pair<T extends Comparable<T>> {
	private T first;
	private T second;
	
	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	public T getSecond() {
		return second;
	}
	
	public boolean firstIsLessThanSecond() {
		return(first.compareTo(second)<0);  // Dette virker fordi klassens type er udvidet med klassen Comparables klasse. (De er begge generiske, T)
	}
}





public class duringclass2 {
	public static void printIntPair(Pair<Integer> p) {
		System.out.println(p.getFirst() + "+" + p.getSecond());
		
	}
	
	
	public static void main(String[] args) {
		Pair<Integer> pInt = new Pair<Integer>(3,5);
		Pair<String> pString = new Pair<String>("mojne", "mojne");
		
		printIntPair(pInt);
	}
		
}
