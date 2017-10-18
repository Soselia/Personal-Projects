// Name 		Tyler Taylor
// Date 		7/12/2016
// Description	This program goes over inserting a class into the main file, so you don't need two files
import java.util.Scanner;										// allows the use of the class Scanner
import java.util.ArrayList;												// allows the use of the array list
public class cstage												// this needs to match the file name
{																		// start class Base
		public static void main( String[] args )						// main method begins execution of Java application
		{																// start method main
			Scanner input = new Scanner( System.in );
			ArrayList<student> stud = new ArrayList<student>();			// creates a new array list names stud
			
			System.out.println("Size of Array List = " + stud.size());	// displays the current number of indexs in the array
			System.out.printf("\n");
			
			stud.add(new student("fname1","lname1"));					// this creates a new index
			stud.add(new student("fname2","lname2"));
			stud.add(new student("fname3","lname3"));
			
			for (int i=0;i<stud.size();i++)
			{
				student s = stud.get(i);
				System.out.println("full name = " + s.fullName());
			}
			System.out.printf("\n");
			
			for (student s : stud)										// this does the same thing as the first for loop
			{
				System.out.println("full name = " + s.fullName());
			}
			System.out.printf("\n");
		}																// end method main
}																		// end class Base
class student
{
	private String fName;
	private String lName;
	public student(){}
	public student (String a, String b)
	{
		fName=a;
		lName=b;
	}
	public String fullName()
	{
		return lName + ", " + fName;
	}
}