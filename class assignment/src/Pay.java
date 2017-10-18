/*
 * izzy brooks
 * 9/25/2016
 * itp 120
 * creates a pay class and sets the basic methods
 */
public class Pay {
	//initializing variables
	private float payRate = (float) 9.75;
	
	private float hoursWorked = 0;
	
	private float grossPay;


public Pay( float  hours)
{
	//one argument constructor just for hours
	hoursWorked = hours;
}

public Pay()
{
	//default no arg constructor
	payRate = (float) 9.75;
	hoursWorked = 0;
}

 public Float getHours()
 {
	 //just returns the private variable hours worked
	 return hoursWorked;
	 
 }
 
 public Float getPayRate()
 {
	//just returns the private variable pay rate
	 return payRate;
	 
 }
 public Float getGrossPay()
 {
	//just returns the private variable gross pay
	 return grossPay;
	 
 }
 
 public void setHours(float hour)
 {
	 // sets the private variable hours worked
	 hoursWorked = hour;
	 
 }
 
 public void setpayRate(float pay)
 {
	 // sets the private variable pay rate
	 payRate = pay;
	 
 }
 
 public void calcGrossPay()
 {
	 // calculates gross pay
	 grossPay = hoursWorked * payRate;
 }
 
}