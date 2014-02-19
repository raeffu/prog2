package ch10.quiz.f3;

public class Bird {

	public void doSomething(int i, int ... args) {
		System.out.print("Hallo");
	}

	public void doSomething(double d, int j) {
		System.out.print("Ola");
	}
	
	public static void main(String[] args) {
	   Bird rap = new Raptor();

	   rap.doSomething(1);
	   
	   rap.doSomething(1,2);
	}

	
	
}
