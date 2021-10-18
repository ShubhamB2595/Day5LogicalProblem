package day5Practice;
//class for getting the swap of two number without using third variable
import java.util.Scanner;

public class SwapWithoutThirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st value: ");
		int a = input.nextInt();	// saving the 1st num to variable a
		System.out.println("Enter the 2nd value: ");
		int b = input.nextInt();	// saving the 2nd num to variable b
		//printing the user entered numbers
		System.out.println("Entered numbers are as: " + a + " , " + b);
		//logic for swapping the number 
		a = a + b;
		b = a - b;
		a = a - b;
		//printing the numbers after swapping operation
		System.out.println("After swapping numbers are as: " + a + " , " + b);		
		input.close(); // closing the input scanner function
	}

}
