package _generics.appendable;

public interface Appendable {
  
  <T extends Appendable> void append(Appendable a);

}
