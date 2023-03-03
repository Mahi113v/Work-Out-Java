import java.io.*;
  
class Strings
 {

 public static void main (String[] args) 
{
   String str= "Mahi V",nstr = "";
     char name;
      System.out.print("Enter Name :");
       System.out.println("Mahi V");
        for (int i=5; i<str.length(); i++)
{
          name = str.charAt(i);
           nstr= name + nstr;
}
            System.out.println("Reversed word: "+ nstr);
    }
}