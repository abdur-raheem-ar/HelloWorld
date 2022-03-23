
public class ConditionalStatement {

	public static void main(String[] args) {
		// Conditional Statement - if, if else, if else ladder, nested if
		
		int a = 10;
		int b = 10;
		if (a<b) {
			System.out.println("Success");
			if (a==b) {
				System.out.println("Nested If");
			}
			else {
				System.out.println("Nested Else");
			}
		}
		else {
			System.out.println("Ran");
			if (a == b) {
				System.out.println("Failure");
			}
			
		}

	}

}
