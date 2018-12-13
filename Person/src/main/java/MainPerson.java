public class MainPerson {

	public static void main(String[] args) {

		Person katie = new Person("Katie", 21, "consultant");
		Person joe = new Person("Joe", 21, "Consultant");
		Person dex = new Person("Dex", 22, "Consultant");

		PersonManager manage = new PersonManager();

		manage.addToList(katie.toString());
		manage.addToList(joe.toString());
		manage.addToList(dex.toString());
		manage.print();
	}

}
