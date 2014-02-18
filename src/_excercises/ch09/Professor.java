package _excercises.ch09;

public class Professor extends Person {
  private String _subject;

  public Professor(String name, String email, String subject){
    super(name, email);
    _subject = subject;
  }
  
  public String getSubject() {
    return _subject;
  }

  public void setSubject(String subject) {
    _subject = subject;
  }

  @Override
  public String getDescription() {
    return "Teaches " + _subject;
  }
  
  
}
