import java.util.Scanner;

public class LabNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a number between 1 and 100");
		int number = scnr.nextInt();
		
		if (number % 2 == 0 && number >= 2 && number <= 25)
			System.out.println("Even and less than 25");
		else if (number % 2 == 0 && number >= 26 && number <= 60)
			System.out.println("Even");
		else if (number % 2 == 0 && number > 60)
			System.out.println(number + " Even");
		else {
			if (number % 2 != 0.5 && number <= 60)
				System.out.println(number + " Odd");
			else
				System.out.println("Odd and over 60");
		}
	}

}
