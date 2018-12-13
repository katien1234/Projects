import java.util.ArrayList;

public class PersonManager {

	private ArrayList<String> arrayofPerson = new ArrayList<String>();

	public void addToList(String person) {
		this.arrayofPerson.add(person);

		
	/* 	
		Stream version  of calling a list:
		
		public void printInforFromList() {
		
		personList.stream().foreach(System.out::println);
		
		
		Method for adding to list: 
		public void addToList(Person person) {
		personList.aded(person);
		}
		*/
	}

	public void print() {
		arrayofPerson.stream().forEach(System.out::println);
		;
	}

	// public void print(String name) {
	// System.out.println(arrayofPerson.stream().filter(person ->
	// name.equals(person.getName()).getAny());
}

/* Search through list for a specific name:

public void personSearch(String name) { 
personList.stream().filter(p -> name.equals(p.getName())); 
} 

then on the Runner page: 

pm1.personSearch("Name you want to search"); */