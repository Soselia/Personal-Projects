/*
 * Isabella brooks
 * vigenere
 * probably just a replace then run through c cipher.
 * shouldnt be to hard just long
 * this program encodes a message through vigenere pretty simple just long
 */
import java.util.Scanner;
public class vstager {
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
			 * this is where it changes. we use q here to make sure it isnt below zero
			 * also on top of this for some reason i could only get the array to work if the modulo if was at 26
			 * otherwise fringe letters ended up wrong. still not sure how that works
			 * anyways if the shift makes it less then zero it simply adds it to 26 to bring it back into the array
			 * i havent thuroughly tested so there are probably some bugs with this
			 */ 
			shiftcalc();
		 switch (textb[r])
		 {
		 case 'a':
			 q = 0 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'b':
			 q = 1 - shift;
			 if (q <0)
			 {
				 q = 26+q;
				// System.out.println("b");
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'c':
			 q = 2- shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'd':
			 q = 3 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'e':
			 q = 4 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'f':
			 q = 5 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'g':
			 q = 6 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'h':
			 q = 7 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'i':
			 q = 8 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'j':
			 q = 9 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'k':
			 q = 10 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'l':
			 q = 11 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'm':
			 q = 12 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'n':
			 q = 13 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'o':
			 q = 14 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'p':
			 q = 15 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'q':
			 q = 16 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'r':
			 q = 17 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 's':
			 q = 18 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 't':
			 q = 19 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'u':
			 q = 20 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'v':
			 q = 21 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'w':
			 q = 22 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'x':
			 q = 23 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'y':
			 q = 24 - shift;
					 if (q <0)
					 {
						 q = 26+q;
					 }
			 textb[r] = alph[q];
			 add += textb[r];
			 r++;
			 break;
		 case 'z':
			 q = 25 - shift;
			 if (q <0)
			 {
				 q = 26+q;
			 }
			 textb[r] = alph[q];
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