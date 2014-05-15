package _generics.appendable;


public class Tester {

	public static void main(String[] args) {
		MyString sa = new MyString("aaa");
		MyString sb = new MyString("bbb");
			
		MyString sc = sa.append(sb);
		System.out.println(sa +" + "+sb+" = "+sc);
		
		MyInteger ia = new MyInteger(111);
		MyInteger ib = new MyInteger(222);
		MyInteger ic = ia.append(ib);
				
		System.out.println(ia +" + "+ib+" = "+ic);
			
		MyList<Integer> la = new MyList<Integer>();
		for (int i=0;i<10;i++) {
			la.add(i);
		}
		MyList<Integer> lb = new MyList<Integer>();
		for (int i=10;i<20;i++) {
			lb.add(i);
		}
	
		MyList<Integer> lc = la.append(lb);
		
		System.out.println("Liste la");
		la.printAll();
		
		System.out.println("Liste lb");
		lb.printAll();

		System.out.println("Liste la+lb");
		lc.printAll();

		// CTE
		// MyString sc = sa.append(ib);
		// MyInteger id = ia.append(lc);
		// MyList ld = lc.append(ib);
		
	}

}
