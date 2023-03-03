import java.util.*;
class Cylinder
{
 public static void main(String args[]) 

{   

  Scanner input = new Scanner(System.in);
        
    System.out.println("Enter the first value:");
    String m = input.nextLine();
    System.out.println("Enter the second value:");
    String b = input.nextLine();

      double  cylinder = (22 / 7) * (m + m) * b;
      System.out.println("Cylinder: " + cylinder);      
  }

}