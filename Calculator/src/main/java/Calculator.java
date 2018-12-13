
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int number1 = 5;
	int number2 = 1;
	add(number1,number2);
	minus(number1,number2);
	divide(number1,number2);
	multiple(number1,number2);
				
	}
	
	public static void add(int number1, int number2) {
		System.out.println(number1 + number2); 
	}
	
	public static void minus(int number1, int number2) {
		System.out.println(number1 - number2);
	}
	
	public static void divide(int number1, int number2) {
		System.out.println(number1 / number2);
	}
	
	public static void multiple(int number1,int number2) {
		System.out.println(number1 * number2);
	}

}

