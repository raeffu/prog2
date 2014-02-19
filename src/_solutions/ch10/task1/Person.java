package _solutions.ch10.task1;

public class Person {

		private String email;
		private String name;
		
		public Person(String aName, String anEmail) {
			email = anEmail;
			name = aName;
		}

		public String getEmail() {
			return email;
		}

		public String getName() {
			return name;
		}

		public String getDescription() {
			return "A person with name: "+ name;
		}

	}
