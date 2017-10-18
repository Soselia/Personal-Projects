import java.util.Random;
import java.util.Scanner;
/**
 * this gave me the opportunity to paly with the random utility
 * i should implement it in later times to get a better hang of it 
 * the code is p simple but i will comment it for good practice
 * i broke it into 3 methods for practice declaring methods since i seem to be bad at seperating methods
 * @author Cutie Patootie
 *
 */

public class rstage {
	//number that the rng gives
	static int num = 0;
	//allows the loop to continue til the guess is right
	static boolean i = false;
	//user input scanner
	static Scanner gue = new Scanner(System.in);
	//the user guess
	static int g ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rand();
		intro();
		guess();
	}
	public static void rand()
	{
		//method for generating the random number
		Random ran = new Random();
		num = ran.nextInt(100);
	}
	public static void intro()
	{
		//the intro for the program 
		System.out.println("i will print a number 1-100 you have to guess it");
	}
	public static void guess()
	{
		while (i == false)
		{
			System.out.println("what is your guess");
			g = Integer.parseInt(gue.nextLine());
			if (g<num)
			{
				System.out.println("your number is too low");
			}
			else if (g ==num)
			{
				System.out.println("your number is spot on");
			 i = true;
			}
			else 
			{
				System.out.println("your number is too high");
			}
		}
		System.out.println("congrats would you like to play again?");
	}
}
