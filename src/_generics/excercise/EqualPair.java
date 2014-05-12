package _generics.excercise;

public class EqualPair<S>
{
   private S first;
   private S second;

   public EqualPair(S firstElement, S secondElement)
   {
      first = firstElement;
      second = secondElement;
   }
   
   public void swap(){
     S tmp = first;
     first = second;
     second = tmp;
   }
   
   public S getFirst()
   {
      return first;
   }
   
   public S getSecond()
   {
      return second;
   }
}
