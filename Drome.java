import java.util.*;

 class Drome
{
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);  
   System.out.println("Enter the number");  
    String reverse = ""; 
     String m = input.nextLine(); 
      int length = m.length();   
       for ( int i = length - 1; i >= 0; i-- )  
        reverse = reverse + m.charAt(i);  
         if (m.equals(reverse))  {
          System.out.println("The entered string " +m +" is a palindrome.");  
        }  else  {  
            System.out.println("The entered string " +m +"  isn't a palindrome.");   
     }  
  }
} 