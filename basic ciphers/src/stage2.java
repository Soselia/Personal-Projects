import java.util.Scanner;

/**
 * this will be long and complex so i will only detail outline
 * first cipher will be ceasarian for ease set an array of 26 with all letters
 * deconstruct word into chars and test them against the array.\
 * ask user to set the shift default will be 3 ask will be added after
 * shift each char up specified amount print result
 * @author Cutie Patootie
 *
 */
public class stage2 {
	//alphabet array
	static char[] alph = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	// where it is all added together to be put out at the end 
	 static String add = "";
	 // the array length. actually never used but might be for vig
	 static int bl = 0; 
	 // the number of letters that is shifted
	 static int shift = 3;
	 //r is used for increasing the array number as we go with switch method
	 static int r = 0;
	 //array for the input to be broken into
	 static	char[] breakd;
	 //scanner for user input
	 static Scanner titties = new Scanner(System.in);
	public static void main(String[] args) {
		userinput();
		compare();
	}
	public static void userinput()
	{
		System.out.println(" how much would you like to shift");
		shift = Integer.parseInt(titties.nextLine());
		System.out.println("what would you like encoded");
		String input = titties.nextLine();
	 breakd = input.toCharArray();
		bl = breakd.length;
	}
	public static void compare()
	{
	 while (r<bl)
	 {
		 switch (breakd[r])
		 {
		 case 'a':
			 breakd[r] = alph[(0+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'b':
			 breakd[r] = alph[(1+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'c':
			 breakd[r] = alph[(2+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'd':
			 breakd[r] = alph[(3+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'e':
			 breakd[r] = alph[(4+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'f':
			 breakd[r] = alph[(5+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'g':
			 breakd[r] = alph[(6+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'h':
			 breakd[r] = alph[(7+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'i':
			 breakd[r] = alph[(8+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'j':
			 breakd[r] = alph[(9+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'k':
			 breakd[r] = alph[(10+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'l':
			 breakd[r] = alph[(11+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'm':
			 breakd[r] = alph[(12+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'n':
			 breakd[r] = alph[(13+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'o':
			 breakd[r] = alph[(14+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'p':
			 breakd[r] = alph[(15+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'q':
			 breakd[r] = alph[(16+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'r':
			 breakd[r] = alph[(17+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 's':
			 breakd[r] = alph[(18+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 't':
			 breakd[r] = alph[(19+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'u':
			 breakd[r] = alph[(20+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'v':
			 breakd[r] = alph[(21+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'w':
			 breakd[r] = alph[(22+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'x':
			 breakd[r] = alph[(23+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'y':
			 breakd[r] = alph[(24+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case 'z':
			 breakd[r] = alph[(25+shift)%26];
			 add = add + breakd[r];
			 r++;
			 break;
		 case ' ':
			 breakd[r] = ' '; 
			 add = add + breakd[r];
			 r++;
			 break;
	     }
    }
	 System.out.println(add);
	}
}

