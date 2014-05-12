package _recursion.triangle;
public class TriangleTester
{
   public static void main(String[] args)
   {
      Triangle t = new Triangle(3);
      int area = t.getArea();
      System.out.println("Area: " + area);
      System.out.println("Expected: 55");   
   
   }
}
