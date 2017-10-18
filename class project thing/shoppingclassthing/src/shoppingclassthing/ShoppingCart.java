package shoppingclassthing;

import java.util.Scanner;

/*izzy brooks
 * 4/19/16
 * itp 100 week 14
 */
public class ShoppingCart {
	//variables to hold price
	//itemlist. max amount of items
	static int il;
	//simpler counter for moving along array
	static int z;
	//array for prices
	static int[] price = new int[il];
	 
	//variable to hold the total
	static int total;
	
	//variables to hold the names of items
	static String[] item = new String[il];
	
	//variable to hold the continue value
	static int cont;
	//for telling the loop when to stop
	static int repeat;
	
	
	//create the scanner variable
	static Scanner in = new Scanner(System.in);

	public ShoppingCart()
	{
		total = 0;
		z = 0;
		cont = 0;
		repeat = 0;
		il = 100;
	}
	
	
	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		System.out.println("how many items do you have?");
		il = Integer.parseInt(in.nextLine());
		String[] item = new String[il];
		int[] price = new int[il];
		
		System.out.println("Enter an item");
		item[z] = in.nextLine();
		System.out.println(item[z]);
		System.out.println("Enter a price");
		price[z] = Integer.parseInt(in.nextLine());
		System.out.println(price[z]);
		
		//add the price to total
		total = total + price[z];
		repeat=repeat + 1;
		z = z + 1;
		
		//ask the use if they want to enter an item or
		//see the total, 1 is yes, 0 is no
		while (repeat < il)
		{
		System.out.println("Enter another item? 1 is yes, 0 is no");
		cont = Integer.parseInt(in.nextLine());
		
		//if statement to determine what happens next
		if(cont == 1)
		{
			System.out.println("Enter a item");
			item[z] = in.nextLine();
			System.out.println(item[z]);
			System.out.println("Enter a  price");
			price[z] = Integer.parseInt(in.nextLine());
			System.out.println(price[z]);
			total = total + price[z];
			repeat=repeat + 1;
			z = z + 1;
			
		}
		else
		{
			repeat= repeat +100;
		}
		}
		//print the total to the screen
		System.out.println("your total is " + total);
	}

}
