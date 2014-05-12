package _recursion._excercise;

public class ReverseString {

  private String word;

  public ReverseString(String word) {
    this.word = word;
  }

  public void reverse() {
    if (this.word.length() <= 1) {
      return;
    }

    ReverseString shortWord = new ReverseString(this.word.substring(1));
    shortWord.reverse();

    this.word = shortWord.getText() + this.word.charAt(0);
  }

  public String getText() {
    return this.word;
  }

  public static String reverse(String word) {
    // base case
    if (word.length() <= 1) {
      return word;
    }

    // recursion
    String tail = word.substring(1, word.length());
    String first = word.substring(0, 1);

    return reverse(tail) + first;
  }

  public static void main(String[] args) {
    System.out.println(reverse("Hello!"));

    ReverseString hello = new ReverseString("Hello!");
    hello.reverse();
    System.out.println(hello.getText());
  }

}
