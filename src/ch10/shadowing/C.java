package ch10.shadowing;

public class C extends B {
	
	public int x = 3;

	public void print() {

		System.out.println("x = "+x);
		System.out.println("this.x = "+this.x);
		System.out.println("super.x = "+super.x);
		System.out.println("((B)this.x = "+((B)this).x);
		System.out.println("((A)this.x = "+((A)this).x);
	}
}
