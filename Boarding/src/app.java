import java.util.Arrays;
import java.util.Scanner;

public class app {
	//the variable for counting up on the first class seating
	static int firstVar = 0;
	//variable for counting up on the economy seating
	static int econVar  = 5;
	//inut for if one of the two is full
	static String classFullInp =" ";
	//input for the class selection
	static int inputNum;
	//the actual array
	static boolean[] seats = new boolean[10];
	static Arrays.fill(seats, false);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//repeats it 10 times
		 for(int i=0; i<10;i++){
			 //selection
		System.out.println("Please type 1 for first class, and 2 for economy");
		Scanner input = new Scanner(System.in);
		inputNum = input.nextInt();
		if (inputNum == 1) {
			//if the variable is full it offers economy. i was gonna put in actual exception and try catches, but ran out of time
			 if (firstVar >= 5) {
				 //selection with multiple ways of typing yes, also amkes sure economy isnt full. was gonna do more with that
				 System.out.println("All First class seating is filled, would you like to be placed in Economy>?");
				 classFullInp= input.nextLine();
				 if (classFullInp == "yes" || classFullInp == "Yes" || classFullInp =="y"&&econVar < 10)
				 {
				 seats[econVar] =true;
					econVar += 1;
					System.out.println("You selected  Economy, and your seating number is " +econVar);
				 }
				 else {
					 System.out.println("Nex flight leaves in 3 hours");
				 }
			 }
			 else {
		System.out.println("first class");
		seats[firstVar] =true;
		firstVar += 1;
				System.out.println("You selected first class, and your seating number is " +firstVar);
			 }
		}
		//same as the first, but reverse
		else if (inputNum == 2) {
		 System.out.println("economy"); 
		 if (econVar >= 10) {
			 System.out.println("All economy seating is filled, would you like to be placed in First class?");
			 classFullInp= input.nextLine();
			 if (classFullInp == "yes" || classFullInp == "Yes" || classFullInp =="y" && firstVar <5)
			 {
			 seats[firstVar] =true;
				firstVar += 1;
				System.out.println("You selected first class, and your seating number is " +firstVar);
			 }
			 else {
				 System.out.println("Nex flight leaves in 3 hours");
			 }
		 }
		 
		 else{
		 seats[econVar] =true;
			econVar += 1;
			System.out.println("You selected  Economy, and your seating number is " +econVar);
		 	 }
		}
		 }
	}

}
