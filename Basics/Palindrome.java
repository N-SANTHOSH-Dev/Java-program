// Check for Palindrome
//     Determine if a string or number reads the same backward.

import java.util.*;
public class Palindrome{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int temp=num;
    int rev=0;
    while(temp!=0){
      int r=temp%10;
      rev=rev*10+r;
      temp/=10;
    }
    System.out.println(num==rev ? "YES ":"NO");
    scan.close();
  }
}