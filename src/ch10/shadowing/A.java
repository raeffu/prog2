package ch10.shadowing;

public class A {

	public int x = 1;
	
	public static void main(String[] args) {
		
		C c = new C();
		
		c.print();
		
		System.out.println("c.x = "+c.x); // Field x of class C 
		System.out.println("((B)c).x = "+((B)c).x); // Field x of class B 
		System.out.println("((A)c).x = "+((A)c).x); // Field x of class A 
		
	}

}
