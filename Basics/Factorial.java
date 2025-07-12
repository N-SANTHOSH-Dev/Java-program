// Find Factorial of a Number Using both recursion and iteration
import java.util.*;
  public class Factorial{
    
   public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter number :");
    int a=scan.nextInt();
    int fact=1;
    for(int i=1;i<=a;i++){
      fact*=i;
    }
    System.out.println("Factorial of "+a+" is "+fact);
    scan.close();
   }
   }