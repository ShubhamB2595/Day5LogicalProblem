package day5Practice;
import java.util.Scanner;
// for checking entered character is vowel or consonant
public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the character");
		char chr = input.next().charAt(0); // Saving entered character to chr
		// checking the character is vowel or consonant
		if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u' || chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U') {
			System.out.println("Entered character " + chr + " is Vowel"); }
		else { System.out.println("Entered character " + chr + " is Consonant"); }	
		input.close();
	}
		
}