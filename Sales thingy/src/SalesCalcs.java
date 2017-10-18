/*
 *  Izzy Brooks
 *  sales.java
 *  due 9/15/16 
 *  takes input from the other class and uses it to get numbers
 */
public class SalesCalcs {
	
	public static float calcComm(float price, double commisionRate)
	{
		/*this method takes the input price and commision rate
		 * it multiplies commisionRate which was already divided by 100
		 * then it returns this amount to Sales.java
		 */
		float commisionAmount = (float) (price * (commisionRate/100));
		return commisionAmount;
	}
	
	public static float calcDisc(float price, double discountRate)
	{
		/*this method takes the input price and discount rate
		 * it multiplies discountRate which was already divided by 100
		 * then it reurns this amount to Sales.java
		 */
		float DiscountAmount = (float) (price * (discountRate/100));
		return DiscountAmount;
	}
	
	public static float tax(float netSale)
	{ 
		/*this only takes in net sale
		 * it multiplies net sale by a static tax (.15)
		 * then it returns that number to Sales.java
		 */
		float tax;
		tax = (float) (netSale *0.15);
		return tax;
	}
}
