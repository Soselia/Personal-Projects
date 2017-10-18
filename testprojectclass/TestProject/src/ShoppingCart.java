import java.util.Scanner;

/*
 * Izzy Brooks	
 * 4/19/16
 * ITP 100 week 14
 * tell user to enter price and item
 * read in a price
 * add price to total
 * ask if they want to add another item
 * ask if they want another item repeat steps 1-3 if needed
 * display total
 */
public class ShoppingCart {
	static int price1;
	static int price2;
	static int total;
	static int cont;
	static String item1;
	static String item2;
	// two variables for price one to hold total one to hold decision data
	// strings to hold item names
	
	// next class a while loop and array top make it work three times
	static Scanner in = new Scanner(System.in);
	public ShoppingCart()
	{
		total = 0;
		price1 = 0;
		price2 = 0;
		item1 = "";
		item2 = "";
	}
	public static void main(String[] args) 
	{
		 
		// TODO Auto-generated method stub
		System.out.println("enter item");
		item1 = in.nextLine();
		System.out.println("enter price");
		price1 = Integer.parseInt(in.nextLine());
		total = total + price1;
		System.out.println("your total is"+ " " + total);
		System.out.println("would you like to add another item  0 is no or 1 is yes");
		cont = Integer.parseInt(in.nextLine());
		if (cont == 1)
		{
			System.out.println("enter item");
			item2 = in.nextLine();
			System.out.println("enter price");
			price2 = Integer.parseInt(in.nextLine());
			total = total + price2;
			System.out.println( "your total is" + " " + total);
		}
		if (cont == 0)
		{
		 System.out.println( "your total is" + " " + total);	
		}
		}
	}
	

