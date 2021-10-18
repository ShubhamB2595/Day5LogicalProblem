package day5Practice;
import java.util.Scanner;
	//Class for getting the Harmonic number
public class HarmonicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for printing Harmonic Value: ");
		int num = input.nextInt();	//saving user entered number to num
		if(num != 0) {		//Checking for num is greater than 0
		System.out.println("Harmonic value as: ");
			for(int i=1; i<=num; i++) {
				System.out.print("1/" + i + " + "); 	//Printing harmonic value
			}	
		}
		// for getting number greater than 0
		else { System.out.println("Enter the number greater than 0"); } 
		input.close();
	}

}
