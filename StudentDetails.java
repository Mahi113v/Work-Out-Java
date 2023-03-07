package com.mypackage;

import java.util.*;

public class StudentDetails
{
  private int roll;
    private String name;
      private int getRoll()
 {
   return roll;
 }
  public void setRoll(int roll)
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
}