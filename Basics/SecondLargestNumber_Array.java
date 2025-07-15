import java.util.*;
public class SecondLargestNumber_Array {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Entre the size of Array : ");
     int n=scan.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
       arr[i]=scan.nextInt();
      }
    int max=0;
    int secMax=0;
    for(int val:arr){
      if(val>max){
        secMax=max;
        max=val;
      }
    }
     System.out.println(secMax);
     scan.close();
  }
}
