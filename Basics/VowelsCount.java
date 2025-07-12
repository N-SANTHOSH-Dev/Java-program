// Count Vowels in a String
      // Use loops or regex to count vowels.

import java.util.*;      
public class VowelsCount {
   public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     String str=scan.nextLine();
     int count=0;
     str.toLowerCase();
     char[] ch=str.toCharArray();
     for(char character:ch){
      if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u') count++;
     }
     System.out.println("VOWELS ="+count);
     scan.close();
   }
}
