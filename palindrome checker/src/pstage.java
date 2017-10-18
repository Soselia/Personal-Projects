import java.util.Scanner;

public class pstage {
/**
 * this one is also p easy. simple use a string to char array then check it 
 * forwards to backwards
 * if all matches then one result else another
 * ok longer then initially thought. used a char replacer to get rid of
 * all punctuation and spaces before it checks
 * then it checks first against last and continues til the two sides meet 
 * COMPLETE 
 * maybe revisit and get rid of fact it cant have a "
 * @param args
 */
	static boolean t;
	static int r = 0;
	static char[] pla;
	static String pal = "";
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userinput();
		tidyup();
		check();
		System.out.println(t);
	}
		public static void userinput()

		{
			System.out.println("enter your palindrome");
				pal = input.nextLine(); 
		}
		public static void tidyup()
		{
			pal = pal.toLowerCase();
			pal = pal.replace(" ","");
			pal = pal.replace(".","");
			pal = pal.replace("?","");
			pal = pal.replace("!","");
			pal = pal.replace(",","");
			pal = pal.replace(";","");
			pal = pal.replace(":","");
			pal = pal.replace("'","");
			pla = pal.toCharArray();
		}
		public static void check()
		{
			
		while (r<pla.length)
		{		
			
				if(r != (pla.length-r))
				{
					if (pla[r] == pla[(pla.length-r)-1])
					{
						r++;
						t= true;
					}
				else if (pla[r] != pla[(pla.length-r)-1])
					{
							t= false;
						r= r+ 200;
					}
				}
		}
				
			
			
			
		}

	
}
