import java.util.*;
class ifvowel
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.print("enter the character: ");
		 String str = sc.nextLine();
		 if( str == "a" || str == "e" ||str == "i" || str == "o" || str == "u")
		 {
			 System.out.println(" written character is vowel");
		 }
		 else
		 {
			 System.out.println(" written character is consonant");
		 }
	}
}
