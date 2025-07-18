//Find the Duplicate Number
//     Problem: Given an array of n+1 integers where each integer is between 1 and n, find the duplicate number.
//     Example:
//     Input: [1,3,4,2,2]  
//     Output: 2

import java.util.*;
public class FindDuplicatNumber {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Array Size : ");
    int n=scan.nextInt();
    System.out.println("Enter the Array "+n+" Values : ");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scan.nextInt();
    }
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]==arr[j]){
          System.out.println(arr[i]);
          return;
        }
      }
    }
    scan.close();
  }
}
