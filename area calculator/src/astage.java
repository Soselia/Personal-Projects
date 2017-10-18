import java.util.Scanner;

/** 
 * the idea is to run some variables through basic algebra to get area of different shapes
 * 
 * @author Isabella Brooks
 *
 */
public class astage {
	//it is set so if the enter something that cant be done it will ask again
	static int r = 0;
	//for choosing what shape was chosen
	static int c = 0;
	//the numbers given to the program
	static int d,e,w,f = 0;
	//the output of the equation
	static int a = 0;
	//the string of the shape given to the program
	static String shape = "";
	static Scanner idk = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (r == 0)
		{	
		uinput();
		mitigation();
		}
		square();
		triangle();
      cube();
		System.out.println("the area of your "+ shape + " is "+a);
	}
	public static void uinput()
	{
		System.out.println("what kind of shape would you like calculated");
		shape = idk.nextLine();
		shape = shape.toLowerCase();
	}
	public static void mitigation()
	{
		switch (shape)
		{
		case "square":
			c = 1;
			r++;
			break;
		case "triangle":
			c = 2;
			r++;
			break;
		case "cube":
			c = 3;
			r++;
			break;
		case "help":
			System.out.println("you can do a square triangle or cube right now");
			
		}
	}
	public static void square()
	{
		if (c == 1)
		{
		System.out.println("for a square the area is side^2");
		System.out.println("enter a side");
		d = Integer.parseInt(idk.nextLine());
		a = d * d;
		}
	}
	public static void triangle()
	{
      if (c== 2)
      {
		System.out.println("the area of a base is height times base divided by 2");
		System.out.println("what is the height of this triangle");
		d = Integer.parseInt(idk.nextLine());
		System.out.println("what is the base of the triangle");
		e = Integer.parseInt(idk.nextLine());
		a = (d*e)/2;
		}	
   }	
   public static void cube()
   {
       if (c==3)
       {
       System.out.println("the are of a cube is something like length * width * height");
       System.out.println("what is your height?");
       d = Integer.parseInt(idk.nextLine());
       System.out.println("what is the length of your cube?");
       e = Integer.parseInt(idk.nextLine());
       System.out.println("What is the width of your cube");
       w = Integer.parseInt(idk.nextLine());
       a = d*e*w;
       }
   }
	
}
