// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//        Example:
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.
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
      if(sum!=0){
      max=Math.max(max,sum);
      }
      sum+=arr[i];
      if(sum<=0){
          sum=0;
      }
    }
    System.out.println(max);
    scan.close();
}
}