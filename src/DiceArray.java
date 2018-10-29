/**
 * 
 * @author Philip Wellener
 * Comp Sci
 * Period 7
 *
 */

public class DiceArray 
{
	public static void main(String[] args) 
	{
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		int[] count = new int[13];
//Roll dice 1000 times
		for(int i=0; i<1000; i++)
		{
			int roll = die1.roll() + die2.roll();
			count[roll] += 1;
		}
//Print array
		for (int i=2; i<13; i++)
		{
			System.out.println("" + i + " was rolled " + count[i] + " times.");
		}
	}

}
