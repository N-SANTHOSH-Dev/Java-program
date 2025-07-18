// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

import java.util.*;
public class MaximumSubarraySum{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Array Size : ");
    int n=scan.nextInt();
    System.out.println("Enter the Array "+n+" Values : ");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scan.nextInt();
    }
    int sum=arr[0];
    int max=Integer.MIN_VALUE;
    for(int i=1;i<n;i++){
      sum+=arr[i];
      max=Math.max(max,sum);
      if(sum<=0){
          sum=0;
      }
    }
    System.out.println(max);
}
}