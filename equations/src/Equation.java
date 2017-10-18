import java.util.Scanner;
/*
* Author Izzy Brooks
* Date 9/1/2016
* Program name: Equation
*/

 public class Equation
{
	//declaring first and second pair of numerators and denominators
		static int fNumerator,fDenominator,sNumerator,sDenominator;
		// the total after adding the two 
		static int numeratorTotal;
		static int denominatorTotal;
		static double total;
		// initializing a new scanner called input
		static Scanner input = new Scanner(System.in);
   public static void main(String[] arg)
   {
	Userin();
	Calc();
	Outp();
   }
	public static void Userin()
   {
	// prompt the user for the input
	System.out.println("Enter first numerator: ");
	// this simply stores the user input as the corresponding variable
	fNumerator = Integer.parseInt(input.nextLine());	
	System.out.println("Enter first denominator: ");
	fDenominator = Integer.parseInt(input.nextLine());	
	System.out.println("Enter second numerator: ");
	sNumerator = Integer.parseInt(input.nextLine());	
	System.out.println("Enter second denominator: ");
	sDenominator = Integer.parseInt(input.nextLine());	
   }
	public static void Calc()
   {
   /* the numerator total is gotten by timesing the first numerator with the second denominator
   * and the opposite with the second numerator. that's all this line of code does
   */
	numeratorTotal = (fNumerator * sDenominator)+ (sNumerator * fDenominator);
	//denominator is simply both denominators times each other
	denominatorTotal = fDenominator * sDenominator;
	total = (double)numeratorTotal / denominatorTotal;
   }
   public static void Outp()
   {
   // just adding it all together in an output statement
     System.out.println(fNumerator + "/" + fDenominator+ " + " + sNumerator + "/" + sDenominator + " = " + numeratorTotal + "/" + denominatorTotal + " = " + total);
   }
}