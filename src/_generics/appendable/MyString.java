package _generics.appendable;

public class MyString implements Appendable{

  private String _s;
  
  public MyString(String s){
    _s = s;
  }

  @Override
  public <T extends Appendable> void append(Appendable a) {
    // TODO Auto-generated method stub
    
  }

}
