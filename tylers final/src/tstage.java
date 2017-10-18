import java.util.Scanner;	
import java.util.ArrayList;
//Name 		Tyler Taylor
//Date 		07/14/2016
//Description	This is the final exam
/*
 * anyways first we need to get how many employees then incase all the setter methods inside a while loop
 * use this method to set however many employees then of course set all the variables.
 * after this we will use another while to call it all up
 */
public class tstage											// this needs to match the file name
{						
	static Scanner input = new Scanner( System.in );
	static int numemp = 0;
	static int counter = 0;
	static int ans = 0;
	
	static String[] empname;
	static double[] salary;
	static int[] payrate;
	static double[] annual;
	static String[] frequency;
		
	public static void main( String[] args )						// main method begins execution of Java application
		{					
		 intro();
		 relegation();
		 out();
		}
		public static void intro()
		{
			System.out.println("how many employees do you have : ");
			numemp = input.nextInt();
			empname = new String[numemp];
			salary = new double[numemp];
			payrate = new int[numemp];
			annual = new double[numemp];
			frequency = new String[numemp];
		}
		public static void relegation()
		{
			while (counter < numemp)
			{
				ArrayList<employee> emp = new ArrayList<employee>();	
				name();
				salcalc();
		    	payFrequency();
				annualPay();
				emp.add(new employee(empname[counter],salary[counter],payrate[counter]));
				counter++;
			}
		}
			public static void name()
			{
				System.out.println("what is the name of employee " + (counter +1));
				empname[counter] = input.next(); 
			}
			public static void salcalc()
			{
				System.out.println ("how much does "+empname[counter]+" get payed");
				salary[counter] = input.nextDouble();
				
			}
			public static String payFrequency()
			{
				
				System.out.println("how frequently is the employee paid (1 =  weekly, 2 = bi-weekly, 3 = semi-monthly, 4 = monthly)");
				ans = input.nextInt();
				switch(ans)
				{
					case 1:
					frequency[counter] = "Weekly";
					break;
					case 2:
					frequency[counter] = "Bi-Weekly";
					break;
					case 3:
					frequency[counter] = "Semi-Monthly";
					break;
					case 4:
					frequency[counter] = "Monthly";
					break;
				}
				return frequency[counter];
			
			}
			public static double annualPay()
			{
				switch(ans)
				{
					case 1:
					annual[counter] = salary[counter]*52;
					break;
					case 2:
					annual[counter] = salary[counter]*26;
					break;
					case 3:
					annual[counter] = salary[counter]*24;
					break;
					case 4:
					annual[counter] = salary[counter]*12;
					break;
				}
				
				return annual[counter];
			}
			
			public static void out()
			{
				System.out.println("Employees Report");
				System.out.println("Name \t Salary \t Annual Salary \t Pay Frequency");
				System.out.println("---- \t ------ \t ------------- \t -------------");
				for (int i=0; i<numemp; i++)
				{
					System.out.println(empname[i] + " \t " + salary[i] + " \t\t " + annual[i] + " \t " + frequency[i]);
				}
			}
			
			
}

class employee 
{
	private String name;
	private double salary ;
    private int frequency;
    public employee(){}
    public employee (String a, double b, int c)
    {
    	name = a;
    	salary = b;
    	frequency = c;
    	
    }
}
