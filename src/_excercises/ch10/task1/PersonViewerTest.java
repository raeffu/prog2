package _excercises.ch10.task1;

public class PersonViewerTest {
  
  public static void main(String[] args) {
    PersonViewer personViewer = new PersonViewer();
    
    Professor prof = new Professor("Prof", "prof@bfh.ch", "Prog2");
    Student stud = new Student("Studi", "studi@bfh.ch", "A");
    Employee emp = new Employee("Employee", "employee@bfh.ch", "IT");
    
    personViewer.view(prof);
    personViewer.view(stud);
    personViewer.view(emp);
  }
  
}
