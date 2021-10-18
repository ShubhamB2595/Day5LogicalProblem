package day5Practice;
// created class for calculating the table for power of 2
import java.util.Scanner;
public class Powerof2 {
	
// main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;	//variable for taking input
		int power = 1;	// variable for power of 2 starting from 1
		
		System.out.println("Enter the number for calculating power table:"); //Taking input
		Scanner input = new Scanner(System.in);
		num = input.nextInt();	//saving input in variable num
		// logic for printing table of power of 2
		for(int i=0; i<=num; i++) {
			System.out.println("Power of 2^" + i + " = " + power);
			power *= 2;	// for calculating power of 2 
		}
		input.close();
	}

}
