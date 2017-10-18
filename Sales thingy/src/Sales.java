/*
 *  Izzy Brooks
 *  sales.java
 *  due 9/15/16 
 *  takes in 4 numbers and calculates out the totals and such
 */
import java.util.Scanner;
public class Sales {

	public static void main(String[] args) {
		//scanner for accepting input
		Scanner inp = new Scanner(System.in);
		//this is how many of an item they got
		int quantity;
		//the price of the item
		float price;
		//this is a percentage for the commision rate so like 3.5% or something like that
		double commisionRate;
		//this is another percentage, this time for the discount
		double discountRate;
		//this chunk is simply getting the numbers from user input
		System.out.println("please enter the quantity");
		quantity = Integer.parseInt(inp.nextLine());
		
		System.out.println("please enter the price");
		price = Float.parseFloat(inp.nextLine());
		
		System.out.println("please enter the commission ");
		commisionRate = Double.parseDouble(inp.nextLine());
		
		System.out.println("please enter the discount");
		discountRate = Double.parseDouble(inp.nextLine());
		
		//this calls the sale amount method and stores the result in a variable to be used later
		float SaleAmount= saleAmt(quantity,price);
		
		//this calls the calculate discount method from the sales calc class and stores the result in a variable to be used later
		float DiscountAmount= SalesCalcs.calcDisc(price,discountRate);
		
		//this calls the calculate Commision method from the sales calc class and stores the result in a variable to be used later
		float CommisionAmount= SalesCalcs.calcComm(price,commisionRate);
		
		//this calls the net sale method and stores the result in a variable to be used later
		float netSaleAmount = netSale(SaleAmount,DiscountAmount,CommisionAmount);
		
		//this calls the tax method from the sales calc class and stores the result in a variable to be used later
		float tax = SalesCalcs.tax(netSaleAmount);
		
		//this calls the final sale method to print out the results and such
		finalSale(netSaleAmount,tax);
	}
	public static float saleAmt(int quantity,float price)
	{  
		/* this method takes the input quantity, which is an integer, and price which is a float
		 * it simply multiplies these two numbers and after storing it in a local variable returns it to be stored and used later
		 */
		float saleAmountTemp;
		saleAmountTemp = quantity * price;
		return saleAmountTemp;
	}
	
	public static float netSale (float saleAmount, float DiscountAmount,float CommissionAmount)
	{  
		/*this method takes three inputs float sale amount, float discount amount, and float commision amount
		 * it uses these to calculate the net sales by adding commision amount and taking away the discount amount
		 */
		float netSales;
		netSales = saleAmount + CommissionAmount - DiscountAmount;
		return netSales;
	}
	
	public static void finalSale(float netSaleAmount,float tax )
	{ 
		/* final sale is takes the inputs netsale amount and tax
		 * it adds these together to get waht the total would be 
		 * then uses a printf statement to show them to the user
		 */
		//the prompt says to label them but i was unsure how to do it
		float Total = netSaleAmount +tax;
		System.out.printf("%12.2f %12.2f %12.2f\n",netSaleAmount , tax , Total);
		
	}
}
