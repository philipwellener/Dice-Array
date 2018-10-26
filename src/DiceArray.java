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
		
		for(int i=0; i<count.length; i++)
		{
			int roll = die1.roll() + die2.roll();
		}

	}

}
