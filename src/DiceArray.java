/**
 * 
 * @author Philip Wellener
 * Comp Sci
 * Period 7
 *
 */

import java.util.Arrays;
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
//Print array using toString and Arrays class
		System.out.print(Arrays.toString(count));
	}

}
