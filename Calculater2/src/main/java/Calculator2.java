
public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Number = 5;
		int Number60 = 6;
		String operator = "+";
		int Total = Answer(Number, Number60, operator);
		System.out.print(Total);

		
	}
	public static int Answer(int Number1, int Number2, String operator) {
		int total = 0;
		if (operator == "+") {
			total = Number1 + Number2;
			return total;
			}
		
		else if (operator == "-") {
			total = Number1 - Number2;
			return total;
			}
		
		else if (operator == "*") {
			total = Number1 * Number2;
			return total;
		}
		
		else if (operator == "/") {
			total = Number1 / Number2;
			return total; 
		}
		
		else {
			return total;
		}
	}
	
}
	
	