package day5Practice;
import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1 = input.nextInt();		//saving first number to var num1
		System.out.println("Enter 2nd number:");
		int num2 = input.nextInt();		//saving second number to var num2
		System.out.println("Enter 3rd number:");
		int num3 = input.nextInt();		//saving third number to var num3
		int max = num1;		//taking var max and saving 1st value
		if(max > num2) {/* max = max;*/ }
		else { max = num2; }
		if(max > num3) { /* 8max = max; */ }
		else { max = num3; }
			//Printing the largest number among three
		System.out.println(+ max +" is maximum Number from: " + num1 + " , " + num2 + " , " + num3);
		input.close();
	}

}
