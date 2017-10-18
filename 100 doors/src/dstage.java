
public class dstage {
/** the exercise is 100 doors
 * first pass does nothing next pass opens everydoor then every second door
 * so on till only open the 100th door
 * this will be done with an increasing variable against a bolean array that changes its state
 * COMPLETE
 * a little hadrer then first imagined but still god practice
 * way more roundabout then the given methods but im still new
 * @param args
 */
	static int[] doors = new int[100];
	
	static int r = 0; 
	static int i = 1;
	static int e = 0;
	static int b = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		opener();
	}
	public static void setup()
	{
		while (b<doors.length)
		{
			doors[b] = 0;
			b++;
			
		}
		System.out.println("please work");
	}
	public static void opener()
	{
		while (e<99)
		{
		while (r<doors.length)
		{
			if (doors[r] == 1)
			{
				doors[r] = 0;
				r= r +i;
			}
			else if (doors[r] == 0)
			{
				doors[r] = 1;
				r=r+i;
			}
		}
		r=0;
		i++;
		e++;
	}
		System.out.println(doors[0]);
	
	}
	
}
