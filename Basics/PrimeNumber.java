//Write a Java program to check if the given number is a prime number

import java.util.*;
public class PrimeNumber {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    int c=0;
    for(int i=2;i<num;i++){
      if(num%i==0) c++;
    }
    System.out.println(c==0 ? "Prime":"Not Prime");
  }
}
