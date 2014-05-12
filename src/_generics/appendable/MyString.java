package _generics.appendable;

public class MyString implements Appendable{

  private String _s;
  
  public MyString(String s){
    _s = s;
  }
  
  @Override
  public Appendable append(Appendable a) {
    return null;
  }

}
