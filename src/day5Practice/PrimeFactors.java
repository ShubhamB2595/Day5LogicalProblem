package day5Practice;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter a number for getting prime factors: ");
	      int num = input.nextInt();		//number for getting prime factor
	      System.out.println("Prime Factors are as: ");	
	     // calculation of prime factors
	      for(int i=2; i<num; i++) {	// as prime num start from 2
	         while(num % i == 0) {		//checking factor is prime or not
	            System.out.println(i);
	            num = num / i;
	         }
	      }
	      	//printing last factor if greater than 2
	      if(num > 2) {	System.out.println(num); }
	      input.close();
	}

}
