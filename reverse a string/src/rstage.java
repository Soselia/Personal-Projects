import java.util.Scanner;
/**
 * 
 * @author Isabella Brooks
 *this is pretty simple put string into a char array recount array backwards
 *should be done within an hour
 *
 */
public class rstage {
	static Scanner dicks = new Scanner(System.in);
	static String inp;
	static char[] inpb;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	}
	private static void input()
	{
		System.out.println("enter something and we will reverse it for you");
		inp = dicks.nextLine();
		inpb = inp.toCharArray();
	}

}
