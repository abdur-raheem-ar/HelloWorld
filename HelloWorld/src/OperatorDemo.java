
public class OperatorDemo {

	public static void main(String[] args) {
		// OPERATOR
		//Types - Arithmetic, Assignment, Comparison, Logical, Bitwise
		// Arithmetic - Addition +, Subtraction -, Multiplication *, Division /, Modulus %(remainder)
		int a = 10;
		int b = 3;
		int c = a + 2;
		int d = 10;
		System.out.println("the value is :" + (a % b) + " " + c);
		
		
		//Assignment
		a += 3; // a = a + 3
		b %= 3; // b = b % 3
		System.out.println(a);
		System.out.println(b);
		
		//Comparison
		System.out.println(a < b);
			
		//Logical - AND-&&, OR - ||, NOT - !
		System.out.println(a > b && c < d);
		System.out.println(a > b || c < d);
		System.out.println(!(a > b && c < d));
	}

}
	