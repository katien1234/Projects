
public class Person {

	private String name;
	private int age;
	private String jobTitle;

	public String toString() {
		return (name + " " + age + " " + jobTitle);
	}

	//constructor: 
	public Person(String name, int age, String jobTitle) {

		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;

		
			
		}
		
	//getter returns the same datatype with 0 parameters
	public String getName() {
		
		return name;
		
	}

}

//overiding the string method
//calling the 2 string method of the object superclass 
//e.g. memory address, so you can override this in person, changing the return to the correct one.
//Override: 
	//toS ctlr space - says tostring so click and it generates it 