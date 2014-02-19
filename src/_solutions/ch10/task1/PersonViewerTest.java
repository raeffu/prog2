package _solutions.ch10.task1;

public class PersonViewerTest {


	public static void main(String[] args) {
		
		PersonViewer viewer = new PersonViewer();
		
		Student student = new Student("Max","max@bfh.ch","B");
		Professor prof = new Professor("Mr. X","prof.x@bfh.ch","IT Security");
		Employee empl = new Employee("Erni Müller","erni.mueller@bfh.ch","HR");
		
		viewer.view(student);		
		viewer.view(prof);		
		viewer.view(empl);		
	}

}
