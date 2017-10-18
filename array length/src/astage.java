import java.util.Scanner;

/**
 * this program is easy as fuck it is an array length exercise but i will add user input 
 * @author Isabella Brooks
 * COMPLETE
 * I ADDED COMPLEXITY AND I CANT GET THE RECOUNT FEATURE TO STOP RETURNING NULL
 * ALSO CAPS
 *
 */
public class astage {
	static Scanner dicks = new Scanner(System.in);
	static String item = "";
	static int c = 0;
	static String[] items;
	static int r = 1;
	static int f = 0;
	static int e = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intro();
		while (c==0)
		{
			userinput();
			recount();
		}
		System.out.println("thank you, you have "+ (items.length-1)+ " items");
	}
	public static void userinput()
	{
		items = new String[r];
		item = dicks.nextLine();
		item = item.toLowerCase();
		switch (item)
		{
		case "done":
			c++;
			break;
		case "recount":
			e++;
			break;
			default:
				items[r-1] = item;
				//System.out.println(items[r-1]);
				r++;
		}
	}
	public static void intro()
	{
		System.out.println("welcome whaat would you like to put in your cart");
		System.out.println("hit done when you are finished or recount to see all your items");
	}
	public static void recount()
	{
		if (e ==1)
		{
		//while (f< items.length)
		//{
		   System.out.println("sorry this function wont stop returning null");
			//f++;
			
		//}
		e = 0;
		}
	}
}
