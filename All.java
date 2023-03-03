import java.util.*;
class All
{
 public static void main(String args[]) 

{   
  int f = 10;
  int g = 15;
  int h = 20;
  int m = 25;
  int n = -30;
  boolean o = false;
  boolean p = true;

 System.out.println("Enter Your Name");
 Scanner input = new Scanner(System.in);
 String name = input.nextLine();
 System.out.println(name);
 
 System.out.println("Initial");
 String initial = input.nextLine();
 System.out.println(initial);

 System.out.println(" Enter Your MailId");
 String mail = input.nextLine();
 System.out.println(mail);
 
 System.out.println(" Enter Your Password");
 int password = input.nextInt();
 System.out.println(password);
        
    System.out.println("Enter the first value:");
    Float a = input.nextFloat();
    System.out.println("Enter the second value:");
    Float b = input.nextFloat();
    System.out.println("Enter the third value:");
    Float c = input.nextFloat();
    System.out.println("Enter the four value:");
    Float d = input.nextFloat();
    System.out.println("Enter the five value:");
    Float e = input.nextFloat();

      System.out.println(~m);
      System.out.println(~n);
      System.out.println(!o);
      System.out.println(!p);
      String value = (a==b)?"mahesh":"kumar";
      System.out.println(value);
      System.out.println(10<<25);
      System.out.println(15>>20);
      System.out.println(a<b && a>c);
      System.out.println(a<b & b<c);
      System.out.println(a<b || a>c);
      System.out.println(a>b | b>c);
      System.out.println("Addition:" + (a+b));
      System.out.println("subtraction:" + (d-c));
      System.out.println("Multipication:" + (e*d));
      System.out.println("Division:" + (f/b));
      System.out.println("Modulus:" + (a%e));
      float  cylinder = (22 / 7) * (a + c) * b;
      System.out.println("Cylinder: " + cylinder);
      float prism = 2 * ((a * b) * (b * c) * (c * a));
      System.out.println("Prism: " + prism);
      float area = (a * b)/2;
      System.out.println("Area: " + area);
      System.out.println("Average of five numbers: " + (a + b + c + d + e)/5 );
  
  }

}