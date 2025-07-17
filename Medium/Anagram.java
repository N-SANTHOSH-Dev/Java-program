import java.util.*;
public class Anagram{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter first String:");
    String str1=scan.nextLine();
    System.out.println("Enter Second String:");
    String str2=scan.nextLine();
    if(str1.length()!=str2.length()){
      System.out.println("false");
      return;
    }
    char[] arr1=str1.toCharArray();
    char[] arr2=str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for(int i=0;i<arr1.length;i++){
      if(arr1[i]!=arr2[i]){
        System.out.println("false");
        return ;
      }
    }
    System.out.print("true");
    scan.close();
  }
}