package _generics.appendable;

public class MyInteger implements Appendable {

  private int _i;
  
  public MyInteger(int i){
    _i = i;
  }

  @Override
  public <T extends Appendable> void append(Appendable a) {
    // TODO Auto-generated method stub
    
  }

  
}
