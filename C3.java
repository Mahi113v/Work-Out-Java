import java.util.*;

 class C1
{
 String a = "Addition is : ";
   void math()
 {
   System.out.println(a + " + " + (11 + 12));
 }
}
  class C2 extends C1
  {
    String a = " Dublicate Addition is : ";
   void display()
   {
    int c = 22+20;
     System.out.println(super.a + " + " + c);
      super.math();
   }
  }
   class C3 extends C2
    {
    public static void main(String args[])
     {
     
      C3 obj = new C3 ();
        obj.display(); 
     }
    }
