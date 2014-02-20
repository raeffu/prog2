package _test;

public class ABC {
  public static void main(String[] args) {
    String letters = "ABC";
    char[] numbers = {'1', '2', '3'};
    System.out.println(letters + " easy as " + numbers);

    System.out.print(letters + " easy as ");
    // funktioniert da println überladen ist, char[] als parameter
    System.out.println(numbers);
  }
}