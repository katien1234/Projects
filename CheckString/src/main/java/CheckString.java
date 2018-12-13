
public class CheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hardcore = "Hello World";
		String second = "hello World";
		boolean check = CheckStrings(hardcore,second);
		System.out.print(check);
	}

	public static boolean CheckStrings(String First, String Second) {
		if (First == Second) {
			return true;
		}

		else {
			return false;

		}
	}

}
