// Rotate Problem: Rotate the elements of an array to the right by k steps.
//  Example:
//        Input: arr = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]


import java.util.*;
public class RotateArray {
 public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter Array Size :");
  int n=scan.nextInt();
  System.out.println("Enter Array "+n+" values : ");
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=scan.nextInt();
  }
  System.out.println("Enter number of times to Rotate : ");
  int k=scan.nextInt();
  while(k!=0){
    int val=arr[0];
    for(int i=0;i<n-1;i++){
      arr[i]=arr[i+1];
    }
    arr[n-1]=val;
    k--;
  }
  for(int val:arr){
    System.out.print(val+" ");
  }
  scan.close();
 }
}