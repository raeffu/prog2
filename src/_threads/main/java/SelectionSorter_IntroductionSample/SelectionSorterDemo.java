package _threads.main.java.SelectionSorter_IntroductionSample;

public final class SelectionSorterDemo {
	
	private SelectionSorterDemo(){}

	// Selection Sort Method for Descending Order
	public static void selectionSort(int[] num) {
		int i, j, posTemp, temp;
		for (i = num.length - 1; i > 0; i--) {
			posTemp = 0; // initialize to subscript of first element
			for (j = 1; j <= i; j++) // locate smallest element between positions 1 and i.
				if (num[j] < num[posTemp]) posTemp = j;
			temp = num[posTemp]; // swap smallest found with element in position i					
			num[posTemp] = num[i];
			num[i] = temp;
			print(i,num);
		}
	}
	
	public static void print(int run,int[] num){
		System.out.print("Run: "+(num.length-run)+": ");
		for(int i=0; i<num.length-1;i++) System.out.print(""+num[i]+", ");
		System.out.print(""+num[num.length-1]+"\n");
	}
	
	public static void main(String[] sa){
		int[] ia ={55,7,5,21,2,556,18,3};
		selectionSort(ia);
	}
}
