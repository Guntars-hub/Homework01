import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		// Task 04
		System.out.println(
				"Ievadiet, lai uzzinātu, kurš skaitlis ir lielāks un vai šī skaitļu summa ir vairāk nekā burti Tavā vārdā!");

		Scanner scan = new Scanner(System.in);

		System.out.print("Ievadiet savu vārdu: ");
		String name = scan.nextLine();
		System.out.print("Ievadiet skaitli: ");
		int num1 = scan.nextInt();
		System.out.print("Ievadiet vēl vienu skaitli: ");
		int num2 = scan.nextInt();

		scan.close();

		int sum = num1 + num2;

		if (num1 > num2) {
			System.out.println("Pirmais skaitlis ir lielāks par otro.");
		} else {
			System.out.println("Pirmais skaitlis ir mazāks par otro.");
		}

		if (sum > name.length()) {
			System.out.println("Skaitļu " + num1 + " un " + num2 + " summa ir " + sum
					+ ", kas ir vairāk nekā tik cik burtu Tavā vārdā!");
		} else if (sum < name.length()) {
			System.out.println("Skaitļu " + num1 + " un " + num2 + " summa ir " + sum
					+ ", kas ir mazāk nekā tik cik burtu Tavā vārdā!");
		} else {
			System.out.println("Skaitļu " + num1 + " un " + num2 + " summa ir " + sum
					+ ", kas ir tikpat tik cik burtu Tavā vārdā!");
		}

	}
}
