import java.util.*;
 
class Average

{
 
 public static void main(String[] args)

{

  Scanner input = new Scanner(System.in);
   
  System.out.print("Enter first number: ");
  int a = input.nextInt();
  System.out.print("Enter second number: ");
  int p = input.nextInt();
  System.out.print("Enter third number: ");
  int c = input.nextInt();
  System.out.print("Enter fourth number: ");
  int v = input.nextInt();  
  System.out.print("Enter fifth number: ");
  int m = input.nextInt();

  System.out.println("Average of five numbers is: " + (a + p + c + v + m) / 5);
 }
}