package day5Practice;

public class FlipCoin {

	public static void main(String[] args) {
		
		int numberOfFlips = Integer.parseInt(args[0]);
		int numflips = numberOfFlips;
		if(numberOfFlips <= 0)	{
			System.out.println("The Value of number of flips should be greater than 0");
			return;
			
		}
		int headCounter = 0;
		int tailCounter = 0;
		
		while(numberOfFlips > 0)	{
			double flipVal = Math.random();
			if(flipVal < 0.5)	{
				tailCounter ++;
			} else {
				headCounter++;
			}
			numberOfFlips --;
		}
		double headper = (double)headCounter/numflips;
		double tailper = (double)tailCounter/numflips;
		
		System.out.println("Head percentage is: " + headper);
		System.out.println("Tail percentage is: " + tailper);		
	}	
}
