package ch10.quiz.f1;

public class A {

	A() {
		System.out.println(",A");
	}

	public static void main(String[] args) {
		A a0 = new A();
		B b0 = new B();
		C c0 = new C();
		I i0 = new B();

		A a1 = b0;
		A a2 = c0;
		// CTE:
		//A a3 = i0;    
	  A a4 = (A) i0;

	  // CTE:
    //B b1 = a0;   
		B b2 = (B) a0;   
		// CTE:
    //B b4 = i0;     
		B b5 = (B) i0;

    C c1 = (C) i0; 

		I i1 = i0;
		I i2 = b0;
		// CTE:
    //I i3 = a0;      
	}

}
