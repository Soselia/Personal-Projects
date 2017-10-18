import java.util.Scanner;

public class main {
	/** the purpose of this is to let the user enter text 
	 * and have the program reverse the string
	 * Isabella Brooks 
	 * read string length set first array to read the string
	 * and place each char in it
	 * then the second array will read the max and count down the first array to set it all backwards
	 * then it will enter it into a string
	 *i completed a word reverser could not figure out a
	 *reverser for all letters maybe revisit.
	 *COMPLETE
	 */

	public static void main (String[] args) 
	{
		
		// int for counting up for setting array 
		int a = 0;
		int c = 0;
		//stores the string inputed
		String text;
		@SuppressWarnings("resource")
		int x =   6 + 2 * 3 - 4;
		System.out.println(x);
		 System.out.print("Java ");
         System.out.println("rules!");
		Scanner l = new Scanner(System.in);
		text = l.nextLine();
		System.out.println(text);
		String[] forwards = text.split(" ");
		c = forwards.length;
		String[] back = new String[c];
		while (a<forwards.length)
		{
			back[c-1] = forwards[a];
					a++;
					c--;
			
		}
		a=0;
		while(a<back.length)
		{
				System.out.println(back[a]);
				a++;
	}
		}

}
