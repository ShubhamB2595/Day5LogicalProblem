/*
 * this class is to check the leap year for the entered number by user 
*/
package day5Practice;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		
		int year;
		System.out.println("Enter the year: ");
		Scanner input = new Scanner(System.in);
		year = input.nextInt();
		
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println(+ year + " is leap year");	
		}
		else { System.out.println(+ year + " is not leap year"); }
		input.close();
	}
}
