package Lecture5;

class InHomPair<T,S> {
	private T first;
	private S second;
	
	public InHomPair(T first, S second) {
		this.first = first;
		this.second = second;
	}
	public T getFirst() {
		return first;
	}
	public S getSecond() {
		return second;
	}
}



public class duringclass3 {

	public static void main(String[] args) {
		InHomPair <Integer, String> pIntString = new InHomPair<Integer, String>(2000,"mojn");
		InHomPair <Integer, Integer> pIntInt = new InHomPair<Integer, Integer>(2000,590);
	}
}
