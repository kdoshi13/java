public class FindingVowels{
	public static void main(String args[])
	{
		String str = new String("Hi welcome to tutorialspoint");
		for(int i= 0; i<str.length(); i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'u'){
			System.out.println("given string contains " +str.charAt(i)+" at the index"+ i);
			}
		}
	}
}