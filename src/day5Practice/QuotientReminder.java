package day5Practice;

import java.util.Scanner;

// class for calculating the quotient and reminder
public class QuotientReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, divisor;	// for saving number and divisor
		System.out.println("Enter the number: ");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();	//saving number
		System.out.println("Enter the divisor: ");
		divisor = input.nextInt();	//saving divisor
		
		int quotient = num / divisor;	//Calculating the quotient
		int reminder = num % divisor;	//Calculating the reminder
		//Printing the quotient and reminder
		System.out.println("Quotient for " + num + " / " + divisor + " = " + quotient );
		System.out.println("Reminder for " + num + " % " + divisor + " = " + reminder );		
	input.close();	
	}
}
