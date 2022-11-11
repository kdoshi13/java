import java.util.*;

class ifstate {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the x:");
    int x = sc.nextInt();
    System.out.print("enter the y:");
    int y = sc.nextInt();
    if (x > y) {
      System.out.println("x IS GREATER THAN y");
    } else {
      System.out.println("y is greater than x");
    }
  }
}
