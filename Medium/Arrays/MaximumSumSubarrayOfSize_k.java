// Problem: Maximum Sum Subarray of Size K
// Description:

// Given an array of integers arr and an integer k, find the maximum sum of any contiguous subarray of size k.
//    Input: arr = [2, 1, 5, 1, 3, 2], k = 3  
 //     Output: 9 
//      Explanation: Subarray [5, 1, 3] has the maximum sum = 9

import java.util.*;
public class MaximumSumSubarrayOfSize_k {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Array Size : ");
    int n=scan.nextInt();
    System.out.println("Enter the Array "+n+" Values : ");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=scan.nextInt();
    }
    System.out.println("Enter the K value : ");
    int k=scan.nextInt();
    int max=0;
    for(int i=1;i<=n-k;i++){
      int sum=0;
      for(int j=i;j<k+i;j++){
        sum+=arr[j];
      }
      max=Math.max(max,sum);
    }
    System.out.println("Max : "+max);
}
}
