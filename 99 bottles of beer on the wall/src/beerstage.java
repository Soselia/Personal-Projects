/**
 * X bottles of beer on the wall
 *X bottles of beer
 *Take one down, pass it around
 *X-1 bottles of beer on the wall
 *X-1 bottles of beer on the wall
 *...
 *Take one down, pass it around
 *0 bottles of beer on the wall
 * @author Cutie Patootie
 *the idea is simple i should be able to execute it pretty well
 */
public class beerstage {
	static int bottles = 99;
	public static void main(String[] args) {
		while (bottles > 0)
		{
			wall();
			beer();
			takedown();
		}
		
	}
	public static void wall()
	{
		System.out.println(bottles + " bottles of beer on the wall");
	}
	public static void beer()
	{
		System.out.println(bottles + " bottles of beer");
	}
	public static void takedown()
	{
		System.out.println("take one down pass it around");
		bottles--;
	}
}
