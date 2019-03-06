package Lecture2;
class cycle {
	public String use() {
		return "cycle";
	}
}
class bicycle extends cycle{
	public String use() {
		return "bicycle";
	}
}
class unicycle extends cycle{
	public String use() {
		return "unicycle";
	}
}
class tricycle extends cycle{
	public String use() {
		return "tricycle";
	}
}

class kildemose extends bicycle {
	public String use() {
		return "kildemose bicycle";
	}
}

class person {
	void ride(cycle a) {
		System.out.println(a.use());
		
	}
}
public class Ex13 {
public static void main(String[] arg) {
	person Hans = new person();
	kildemose g = new kildemose();
	Hans.ride(g);
}
}
