import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		//Task 03
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ievadiet vesalu skaitli: ");
		int A = scan.nextInt();
		System.out.print("Ievadiet decimālskaitli: ");
		double B = scan.nextDouble();
		
		scan.close();
		
		 System.out.println("Skaitļu A un B summa ir: " + (A + B));
		 System.out.println("Skaitļu A un B starpība ir: " + (A - B));
		 System.out.println("Skaitļu A un B reizinājums ir: " + (A * B));
		 System.out.println("Skaitļu A un B dalījums ir: " + (A / B));
		 System.out.println("Skaitļu A un B summas kvadrāts ir: " + (A + B) * (A + B));
	}

}
