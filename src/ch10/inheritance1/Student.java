package ch10.inheritance1;

public class Student extends Person {
  
  private String _grade;
  
  public Student(String name, String email, String grade){
    super(name, email);
    _grade = grade;
  }
  
  public String getGrade(){
    return _grade;
  }
  public void setGrade(String grade){
    _grade = grade;
  }
  
  public String getDescription(){
    return "A "+_grade+" student";
  }
}
