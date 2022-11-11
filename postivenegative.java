import java.util.*;
class ifstate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the x:");
		int x = sc.nextInt();
		if (x>0)
		{
			System.out.println("x is positive");
		}
		else
		{
			System.out.println("x is negative");
		}
	}
}
