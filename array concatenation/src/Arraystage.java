/**
 * i should probably look up how to add  arrays together so ill make a method for mine then a method for the easier version
 * @author Isabella Brooks
 *COMPLETED MY WAY
 *NOW TO LOOK FOR THE EASY METHOD
 *ALWAYS REMEMBER TO TURN OFF DEBUG WHEN YOU DONT NEED IT SO YOU DONT SPEND 20 MINUTES TRYING TO FIGURE OUT WHY THE SEQUENCE IS REPEATING TWICE
 *also caps again
 */
public class Arraystage {
	static int[] arr1 = {2,3,6,1,2};
	static int[] arr2 = {3,30,4,2,6,7,4};
	static int[] arr3;
	static int r = 0;
	static int f = 0;
	// the 
   static int c = 0;
	static int d = 0;
	//static int w = 0;
	//static int v = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mine();
		teller();
	}
	public static void mine()
	{
	    arr3 = arr1;
		arr1 = new int[(arr1.length+arr2.length)];
		//r = arr1.length;
		
		while (r<arr1.length)
		{
			while (d<arr3.length)
			{
				arr1[r] = arr3[d];
				d++;
				r++;
				//System.out.println(arr1[w]);
			}
			
			arr1[r] = arr2[f];
			//System.out.println(arr1[r]);
			r++;
			f++;
		}
		
	}
	public static void teller()
	{
		while (c<arr1.length)
		{
			System.out.println(arr1[c]);
			c++;
		}
	}
}
