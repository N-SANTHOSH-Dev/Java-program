// Remove duplicates from an array.

import java.util.*;
public class RemoveDuplicates{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Entre the size of Array : ");
     int n=scan.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
       arr[i]=scan.nextInt();
     }
     Arrays.sort(arr);
     int arr1[]=new int[n];
     int j=0;
     arr1[j++]=arr[0];
     for(int i=1;i<n;i++){
      if(arr[i]!=arr[i-1]){
        arr1[j]=arr[i];
        j++;
      }
     }
     for(int i=0;i<j;i++){
      System.out.print(arr1[i]+" ");
     }
     scan.close();
  }
}
