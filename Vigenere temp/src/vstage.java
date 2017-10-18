/*
 * isabella brooks
 * vigeneere
 * probably just a replace then run through c cipher.
 * shouldnt e to hard just long
 */
import java.util.Scanner;
public class vstage {
 static int r = 0;
 static int q = 0;
 static int e = 0;
 static String text = "";
 static String cipher ="";
 static char[] textb;
 static char[] cipherb;
 static char[] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
 static Scanner input = new Scanner(System.in);
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void intro()
	{
		System.out.println("enter a word then enter your cipher");
		text = input.nextLine();
		cipher = input.nextLine();
		text = text.toLowerCase();
		text = text.replaceAll(" ","");
		cipher = cipher.toLowerCase();
		cipher = cipher.replaceAll(" ","");
		
		textb = text.toCharArray();
		cipherb = cipher.toCharArray();
	}

	public static void breakdown()
	{
		
	}
}
