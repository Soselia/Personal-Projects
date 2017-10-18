/*
 * Isabella brooks
 * vigenere
 * probably just a replace then run through c cipher.
 * shouldnt be to hard just long
 * this program encodes a message through vigenere pretty simple just long
 */
import java.util.Scanner;
public class vstage {
 // the shift int is how far the letter shifts
// the r int is where in the textb array we are
 // the e int is how long the textb is so we dont go out of array bounds
 static int shift,r,q,e = 0;
 //the initial string that takes the user input
 static String text = "";
 //the string that takes the cipher input
 static String cipher ="";
 //the char array for comparing against 
 static char[] textb;
 //the cipher break down for deciding shift. further explained in shift calc
 static char[] cipherb;
 //where it adds the entire string together so it can be printed at the end
 static String add = "";
 // the alphabet for ease of shifting
 static char[] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
 // scanner for user input of course
 static Scanner input = new Scanner(System.in);
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//just calling different methods here. ive been trying to work on encapsulation
		intro();
		breakdown();
		result();
		
	}
	public static void allmethods()
	{
		intro();
		breakdown();
		result();
	}
	public static void intro()
	{
		// tells the user what to do
		System.out.println("enter a word then enter your cipher");
		//gathers user input
		text = input.nextLine();
		cipher = input.nextLine();
		//switches text and cipher into a uniform shape without spaces or caps
		text = text.toLowerCase();
		text = text.replaceAll(" ","");
		cipher = cipher.toLowerCase();
		cipher = cipher.replaceAll(" ","");
		//sets e so we can run the breakdown method properly
		e = text.length();
		// sets the two char arrays for  use in other methods
		textb = text.toCharArray();
		cipherb = cipher.toCharArray();
	}

	public static void breakdown()
	{
		// e is text length and r counts up to it. theres probably an easier way but this is the one i know
		while (r<e)
		{
			/*
			 * shift calc calls the next method so it can calculate how much it needs to shift between letters
			 * the switch case is to match the textb to its corresponding letter so we get a number in the alphabet
			 * then we simply set that specific  array piece to where it is in the alphabet plus the corresponding number
			 * plus the shift modulo 26 to keep it inside the bounds of the alphabet
			 */
			shiftcalc();
		 switch (textb[r])
		 {
		 case 'a':
			 textb[r] = alph[(0+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'b':
			 textb[r] = alph[(1+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'c':
			 textb[r] = alph[(2+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'd':
			 textb[r] = alph[(3+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'e':
			 textb[r] = alph[(4+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'f':
			 textb[r] = alph[(5+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'g':
			 textb[r] = alph[(6+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'h':
			 textb[r] = alph[(7+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'i':
			 textb[r] = alph[(8+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'j':
			 textb[r] = alph[(9+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'k':
			 textb[r] = alph[(10+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'l':
			 textb[r] = alph[(11+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'm':
			 textb[r] = alph[(12+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'n':
			 textb[r] = alph[(13+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'o':
			 textb[r] = alph[(14+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'p':
			 textb[r] = alph[(15+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'q':
			 textb[r] = alph[(16+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'r':
			 textb[r] = alph[(17+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 's':
			 textb[r] = alph[(18+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 't':
			 textb[r] = alph[(19+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'u':
			 textb[r] = alph[(20+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'v':
			 textb[r] = alph[(21+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'w':
			 textb[r] = alph[(22+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'x':
			 textb[r] = alph[(23+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'y':
			 textb[r] = alph[(24+shift)%26];
			 add += textb[r];
			 r++;
			 break;
		 case 'z':
			 textb[r] = alph[(25+shift)%26];
			 add += textb[r];
			 r++;
			 break;
	     }
		}
		
		
	}
	public static void shiftcalc()

	{
		/* set an in method variable since it never needs to be called outside method
		 * ok so a few things here
		 * the switch compares it to the alphabet like last time but this time simply makes the shift rise in number
		 * the shift in a vigenere actually starts at zero so im going to go through and fix this
		 * 
		 */
	 char	s=cipherb[(r%cipherb.length)];
	 
	switch (s)
	{
	case 'a':
		 shift = 0;
		 break;
	 case 'b':
		shift = 1;
		 break;
	 case 'c':
		shift = 2;
		 break;
	 case 'd':
		shift = 3;
		 break;
	 case 'e':
		 shift = 4;
		 break;
	 case 'f':
		 shift = 5;
		 break;
	 case 'g':
		shift = 6;
		 break;
	 case 'h':
		shift = 7;
		 break;
	 case 'i':
		shift = 8;
		 break;
	 case 'j':
		 shift = 9;
		 break;
	 case 'k':
		shift = 10;
		 break;
	 case 'l':
		shift = 11;
		 break;
	 case 'm':
		shift = 12;
		 break;
	 case 'n':
		shift = 13;
		 break;
	 case 'o':
		shift = 14;
		 break;
	 case 'p':
		shift = 15;
		 break;
	 case 'q':
		 shift = 16;
		 break;
	 case 'r':
		shift = 17;
		 break;
	 case 's':
		 shift = 18;
		 break;
	 case 't':
		shift = 19;
		 break;
	 case 'u':
		 shift = 20;
		 break;
	 case 'v':
		shift = 21;
		 break;
	 case 'w':
		shift = 22;
		 break;
	 case 'x':
		shift = 23;
		 break;
	 case 'y':
		shift = 24;
		 break;
	 case 'z':
		shift = 25;
		 break;
    }
	}
	public static void result()
	{
		//just prints out the line of text from all the calculating but i wanted to encapsulate it
		System.out.println(add);
	}
}

