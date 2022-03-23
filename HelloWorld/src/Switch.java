import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the day: ");
		String day = reader.nextLine();
		// Switch
		System.out.print("The day is ");
		switch (day) {
			case "day1":
				System.out.println("Sunday");
				break;
			case "day2":
				System.out.println("Monday");
				break;
			case "day3":
				System.out.println("Tuesday");
				break;
			case "day4":
				System.out.println("Wednesday");
				break;
			case "day5":
				System.out.println("Thursday");
				break;
			case "day6":
				System.out.println("Friday");
				break;
			case "day7":
				System.out.println("Sunday");
				break;
			default:
				System.out.println("None of the above");
		}
	}

}
