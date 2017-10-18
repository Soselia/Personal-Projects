/*
 * izzy brooks
 * 9/25/2016
 * itp 120
 * uses pay class and methods
 */
public class testPay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creates 2 pay class objects and then sets their variables before outputting them
		Pay emp1 = new Pay();
		Pay emp2 = new Pay(36);
		emp1.setHours(48);
		emp2.setpayRate((float) 15.60);
		emp1.calcGrossPay();
		emp2.calcGrossPay();
		System.out.printf("%12S %12S %12S\n","payRate","Hours" ,"gross Pay");
		System.out.printf("%12.2f %12.2f %12.2f\n",emp1.getPayRate() ,emp1.getHours() ,emp1.getGrossPay());
		System.out.printf("%12.2f %12.2f %12.2f\n",emp2.getPayRate() ,emp2.getHours() ,emp2.getGrossPay());
	}

}
