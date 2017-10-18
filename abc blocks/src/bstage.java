import java.util.Scanner;

/**
 * so the point of this is to use letter blocks to make words
 * once a letter is used off a box the box cant be used again
 * not sure how to go about this but ill figure it out
 *@author Cutie Patootie
 *COMPLETE
 *sometimes the solution is so easy and youre just an idiot.
 */
 /*
 *(B O)
 *(X K)
 *(D Q)
 *(C P)
 *(N A)
 *(G T)
 *(R E)
 *(T G)
 *(Q D)
 *(F S)
 *(J W)
 *(H U)
 *(V I)
 *(A N)
 *(O B)
 *(E R)
 *(F S)
 *(L Y)
 *(P C)
 *(Z M))
 */
public class bstage {
	//used for counting the block used and setting it later so it cant be used
	static int[]    blockc = new int[20];
	//array for all the blocks that can be used
	static String[] block = {"BO","XK","DQ","CP","NA","GT","RE","TG","QD","FS","JW","HU","VI","AN","OB","ER","FS","LY","PC","ZM"};
	//scanner for user input
	static Scanner fuck = new Scanner(System.in);
	//for taking user
	static String text = "";
	//the character array that text gets thrown into
	static char[] textb;
	//the character array for the current block. gets changed out everytime the block matches or cant match
	static char[] blockb;
	//the variable that ticks along what letter of the text it is looking for
	static int r = 0;
	//the counter that is matched against textb.length to see if it can be built
	static int i = 0;
	// the counter for which block it is currently checking against
	static int b = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
		checker();
	}
	public static void input()
	{
		System.out.println("please enter the word you would like evaluated");
		text = fuck.nextLine();
		//converts string to uppercase for easy case sensitive matching
		text = text.toUpperCase();
		//puts the text into the text array
		textb = text.toCharArray();
	}
	public static void checker()
	{
		// for checking through all the blocks
		while (r< textb.length)
	  {
		   //for checking through the text with the blocks
			while (b<block.length)
		{
			blockb = block[b].toCharArray();
			//System.out.println(blockb[0]);
			//System.out.println(blockb[1]);
			if (r < textb.length&&blockc[b]!=1){
			//this is for if the block has already been used
			if (textb[r] == blockb[0])
			{
				blockc[b] = 1;
				//increases which letter we are looking for in textb
				r++;
				//increases what block we are matching against
				b=0;
				//increases the i variable
				i++;
				//block[b] = null ;
				System.out.println(blockb[0] + "0");
			}
			else if (textb[r] == blockb[1])
			{
				blockc[b] = 1;
				r++;
				// resets it back to the beginning so it doesn't unnecessarily tick r
				b=0;
				i++;
				//block[b] = null ;
			
				System.out.println(blockb[1] + "1");
			}
			}
			
			
			
			b++;
			
		}
		r++;
		b = 0;
	  }
		if (i >= textb.length)
		{
			System.out.println("this statement can be made with the blocks " + i);
		}
		else 
		{
			System.out.println("that cannot be made " + i);
		}
		
	  }}

