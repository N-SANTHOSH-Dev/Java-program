// Move All Zeroes to End
// Problem: Move all zeroes in the array to the end, maintaining the order of other elements.
// Evample:
//       Input: [0,1,0,3,12]  
//       Output: [1,3,12,0,0]

import java.util.*;
import java.util.Scanner;
public class MakeZerosToLast {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter Size of the Array :");
    int n=scan.nextInt();
    System.out.println("Enter the array "+n+" values : ");
    int arr[]=new int[n];
    int k=0;
    for(int i=0;i<n;i++){
      int a=scan.nextInt();
      if(a!=0){
        arr[k]=a;
        k++;
      }
    }
    for(int i:arr){
      System.out.print(i+" ");
    }
    scan.close();
  }
}