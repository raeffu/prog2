package _generics.appendable;

public interface Appendable {
  <T> void append(Appendable a);
}
