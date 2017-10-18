import java.util.Scanner;
public class testACompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creates 3 pay class objects and then sets their variables before outputting them
		//scanner for input
		Scanner scan = new Scanner(System.in);
		// just a temp to hold input before putting it into proper variables
		float temp;
		Pay boss = new Pay();
		Pay manager = new Pay(25);
		Pay accountant = new Pay(17);
		accountant.setHours(38);
		//gets input then sets it into the variable
		System.out.println("enter hours worked for boss");
		temp = scan.nextFloat();
		boss.setHours(temp);
		manager.setHours(46);
		System.out.println("enter bosses payrate");
		temp = scan.nextFloat();
		boss.setpayRate(temp);
		System.out.println("enter accountants payrate");
		temp = scan.nextFloat();
		accountant.setpayRate(temp);
		boss.calcGrossPay();
		manager.calcGrossPay();
		accountant.calcGrossPay();
		System.out.printf("%24S %12S %12S\n","payRate","Hours" ,"gross Pay");
		System.out.printf("%12S %12.2f %12.2f %12.2f\n","boss:", boss.getPayRate() ,boss.getHours() ,boss.getGrossPay());
		System.out.printf("%12S %12.2f %12.2f %12.2f\n","manager:",manager.getPayRate() ,manager.getHours() ,manager.getGrossPay());
		System.out.printf("%12S %12.2f %12.2f %12.2f\n","accountant:",accountant.getPayRate() ,accountant.getHours() ,accountant.getGrossPay());
	}

}
