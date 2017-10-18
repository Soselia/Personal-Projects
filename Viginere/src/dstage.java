import java.util.Scanner;

public class dstage {
	static boolean de;
	static Scanner input = new Scanner(System.in);
	static String text = "";
	static int x = 0;
	
	public static void main(String[] args)
	{
		decide();
		
	}
	public static void decide()
	{
		while (x<1)
		{
		System.out.println("are you encoding or decoding");
		text = input.nextLine();
		if ( text.equals("encoding")||text.equals("e"))
		  {
			vstage.allmethods();
			x++;
		  }
		else if (text.equals("decoding")||text.equals("d"))
		  {
			vstager.allmethods();
			x++;
		  }
		else 
			{
			 System.out.println("sorry that is invalid");
			}
	    }
	}
}
