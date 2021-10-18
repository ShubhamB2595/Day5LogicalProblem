package day5Practice;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number for checking even or odd");
		int num = input.nextInt();
		if(num % 2 == 0) { System.out.println(+ num + " is even number"); }
		else { System.out.println(+ num + " is odd number"); }
		input.close();
	}

}
