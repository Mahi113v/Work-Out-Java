import java.util.*;

package com.mypackage;

public class Studentt
{
  private long roll;
    private String name;
      private int getRoll()
 {
   return roll;
 }
  public void setRoll(long roll)
  {
    this.roll = roll;
  }
   public String getName()
   {
     return name;
   }
   public void setName(String name)
    {
      this.name = name;
    }
   public void display()
     {
       System.out.println("Roll No : " + roll);
       System.out.println("Student Name : " + name);
     }

   public static void main(String args[])
      {
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Your Roll No : ");
	   long roll = sc.nextLong();
	 System.out.println("Enter Your Name : ");
	   String name = sc.nextLine();

	 Studentt obj = new Studentt();
	 obj.display();
      }
}