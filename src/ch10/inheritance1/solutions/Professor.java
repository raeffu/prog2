package ch10.inheritance1.solutions;

public class Professor extends Person{

	private String subject;
	
	public Professor(String aName, String anEmail,String aSubject) {
		super(aName,anEmail);
		subject = aSubject;
	}

	public String getDescription() {
		return getName() + " teaches "+ subject;
	}

}
