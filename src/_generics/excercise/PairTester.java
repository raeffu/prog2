package _generics.excercise;

public class PairTester {
  public static void main(String[] args) {
    
    System.out.println("*** EqualPair Tester ***");
    EqualPair<Integer> p = new EqualPair<Integer>(17, 19);
    System.out.print(p.getFirst());
    System.out.println(" expected: 17");
    System.out.print(p.getSecond());
    System.out.println(" expected: 19");
    System.out.println("\n*** EqualPair Swap ***");
    p.swap();
    System.out.print(p.getFirst());
    System.out.println(" expected: 19");
    System.out.print(p.getSecond());
    System.out.println(" expected: 17");

    System.out.println("\n*** Pair Tester ***");
    Pair<String, Integer> p1 = new Pair<String, Integer>("Lucky Number", 13);
    System.out.print(p1.getFirst());
    System.out.println(" expected: Lucky Number");
    System.out.print(p1.getSecond());
    System.out.println(" expected: 13");

    System.out.println("\n*** Pair Swap ***");
    Pair<Integer, String> p2 = PairUtil.swap(p1);
    System.out.print(p2.getFirst());
    System.out.println(" expected: 13");
    System.out.print(p2.getSecond());
    System.out.println(" expected: Lucky Number");
  }
}
