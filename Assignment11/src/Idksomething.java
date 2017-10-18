import java.util.Scanner;

public class Idksomething {
	/**
	 * ask how many grades
	 * accept user input
	 * ask user to enter grades
	 * repeat til array full
	 * calculate then display average
	 */
	/*
	 *		System.out.println("Enter a item");
	 *		item[z] = in.nextLine();
	 *		System.out.println(item[z]);
	 *		System.out.println("Enter a  price");
	 *		price[z] = Integer.parseInt(in.nextLine());
	 *		System.out.println(price[z]);
	 *		total = total + price[z];
	 *		repeat=repeat + 1;
	 *		z = z + 1;		
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// varaible to count into the array. allows array to be any chosen number
		int r = 0;
		// simply adds up til it hits the same number as the array. is what lets the user input the grades
		int i = 0;
		//counts up again. is waht is neccesary for adding all grades together
		int q= 0;
		// is the total of grades
		int total = 0;
		// is the divided total
		int average = 0;
		
		Scanner in = new Scanner(System.in);
		
		
		
		System.out.println("how many grades would you like to enter?");
		r = Integer.parseInt(in.nextLine());
		int[] grade = new int[r];
		while (i<r)
		{
		System.out.println("enter grade" +" " + (i+1));
		grade[i] = Integer.parseInt(in.nextLine());
		i++;
		}
		if (i==r)
		{
			while ( q<r)
			{
				total = total + grade[q];
				q++;
			}
			average = total / q;
			System.out.println("the average is " + average);
		}
		}
		

}
