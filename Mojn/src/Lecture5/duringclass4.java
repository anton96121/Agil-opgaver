package Lecture5;

class hasM {
	public void m() {
		System.out.println("hi");
	}
}
class hasMM extends hasM {
	public void m() {
		System.out.println("hi agian");
	}
}


class GenericType<T extends hasM>{
	public T obj;
	
	public GenericType(T obj) {
		this.obj = obj;
	}
	
	public void manipulate() {
		obj.m();

	}
}


public class duringclass4 {
 public static void main(String[] args) {
	 GenericType<hasM> gt = new  GenericType<hasM>(new hasM());
	 gt.manipulate();
	 GenericType<hasMM> gt2 = new  GenericType<hasMM>(new hasMM());
	 gt2.manipulate();
 }
}
