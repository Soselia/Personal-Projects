import java.util.Scanner;
/**
 * the idea is to use a string split with space as regex
 * then use the length function to get word total from that
 * COMPLETED
 * maybe future me can add a way to put files through this 
 * @author Cutie Patootie
 *
 */
public class stage1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner co = new Scanner(System.in);
		 String text = co.nextLine();
		 String[] words = text.split(" ");
		 System.out.println("your word total is "+ words.length);
	}

}
