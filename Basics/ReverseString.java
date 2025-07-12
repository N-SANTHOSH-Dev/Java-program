// Reverse a String

    // Without using built-in reverse methods.
    // Using recursion or loops.
  
  import java.util.*;
  public class ReverseString{
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter a String : ");
      String str=scan.nextLine();
      String rev="";
      for(int i=str.length()-1;i>=0;i--){
        rev+=str.charAt(i);
      }
      System.out.println("Reversed String : "+rev);
      scan.close();
    }
  }
