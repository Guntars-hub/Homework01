import java.util.Scanner;

public class GreetingsInteractive {

	public static void main(String[] args) {
		//Task 02
		Scanner scan = new Scanner(System.in); 
				
		System.out.print("Ievadiet savu vārdu: ");
		String name = scan.nextLine();
				
		System.out.print("Ievadiet savu vecumu: ");
		int age = scan.nextInt();
				
		scan.close();
				
		System.out.println("Sveiki, mani sauc " + name + " esmu " + age + " gadus jauns!");
				
	}
}	