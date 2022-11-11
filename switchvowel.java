import java.util.*;
class switchvowel
{
	public static void main(String args[])
	{
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter the character: ");
			 char c = sc.next().charAt(0); 
			 switch(c)
			 {
				 case 'a' : System.out.println("it is a vowel"); break;
				 case 'e' : System.out.println("it is a vowel"); break;
				 case 'i' : System.out.println("it is a vowel"); break;
				 case 'o' : System.out.println("it is a vowel"); break;
				 case 'u' : System.out.println("it is a vowel"); break;
				 default : System.out.println("it is a consonant"); break;
			 }
		}
	}
}
