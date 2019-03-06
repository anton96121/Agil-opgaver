package Lecture2;

class Leaf {
	int i = 0;
	
	void increment () {
		i++;
	}
	
	Leaf increment2 () {
		i++;
		return this;
	}
	
	
	void print() {
		System.out.println(i);
	}
}

public class Duringlecture3 {
	
	public static void main(String[] args) {
	Leaf oak = new Leaf();
	Leaf willow = new Leaf();
	Leaf mojn = new Leaf ();
	
	
	for (int k=0; k<4; k++) {
		oak.increment();
	}
	oak.print();
	
	willow.increment2().increment2().increment2().increment2();
	willow.print();
	
	mojn.increment();//.increment().increment().increment(); This wont work
	mojn.print();
	
	}

}
