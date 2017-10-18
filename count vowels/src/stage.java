import java.util.Scanner;

public class stage {
/** the purpose of this program is to count vowels
 * this will be done with a string to char array
 * and a switch statement
 * maybe add a read in from a file at a later date.
 * COMPLETED 
 * 
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int p = 0;
      int a1 = 0;
      int e1 = 0;
      int u1 = 0;
      int i1 = 0;
      int o1 = 0;
      int v = 0;
      String text = " ";
      Scanner dicks = new Scanner(System.in);
       text = dicks.nextLine();
       char idk[] = text.toCharArray();
       while (p<idk.length)
       {
       switch (idk[p])
       {
       case 'a':
       a1++;
       v++;
       break;
       case 'e':
    	e1++;
    	v++;
    	break;
       case 'u':
        u1++;
        v++;
    	break;
       case 'i':
        i1++;
        v++;
    	break;
       case 'o':
    	o1++;
    	v++;
    	break;
       }   
        p++;
	}
		System.out.println("you have "+a1+ "A's, ");
		System.out.println(e1+ "E's, ");	
		System.out.println(u1+ "U's, ");
		System.out.println(i1+ "I's, ");
		System.out.println(o1+ "o's, ");
		System.out.println(v+ " vowels total");
	}}
