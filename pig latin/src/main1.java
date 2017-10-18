import java.util.Scanner;

public class main1 {
/** the purpose is to print words in pig latin
 * 
 * 
 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words;
		int a = 1;
		String placeholder= " ";
		Scanner te = new Scanner(System.in);
		words = te.nextLine();
		char som[] = words.toCharArray();
		while (a<som.length)
		{
			placeholder= placeholder + som[a];
			a++;
		}
		placeholder = placeholder + som[0]+"ay";
				System.out.println(placeholder);
	}

}
