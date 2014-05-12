package _generics.excercise;

public class MinMaxTester
{
   public static void main(String[] args)
   {
      Coin[] coins = 
      {
         new Coin(0.1, "Dime"),
         new Coin(0.05, "Nickel"),
         new Coin(0.01, "Penny"),
         new Coin(0.25, "Quarter")
      };

      Pair<Coin, Coin> mm = PairUtil.minmax(coins);
      System.out.println(mm.getFirst());
      System.out.println("Expected: Coin[value=0.01,name=Penny]");
      System.out.println(mm.getSecond());
      System.out.println("Expected: Coin[value=0.25,name=Quarter]");
   }
}
