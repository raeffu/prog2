package _solutions.ch10.task1;

public class Student extends Person {

	private String grade;
	
	public Student(String aName, String anEmail, String aGrade) {
		super(aName,anEmail);
		grade = aGrade;
	}

    public String getDescription() {
		return getName()+" is a "+grade+ " grade student";
	}
}
