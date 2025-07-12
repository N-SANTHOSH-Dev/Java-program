// Swap Two Numbers
  //  Without a Third Variable
  // Use arithmetic operations to swap values.

  import java.util.*;
  public class SwapTwoNumbers {
   public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a :");
    int a=scan.nextInt();
    System.out.println("Enter b :");
    int b=scan.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After Swapping : ");
    System.out.println("A "+a+"  "+"B "+b);
    scan.close();
   }
  }