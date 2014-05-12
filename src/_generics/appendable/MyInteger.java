package _generics.appendable;

public class MyInteger implements Appendable {

  @Override
  public <T extends Appendable> append(Appendable a) {
    return null;
  }
  
}
