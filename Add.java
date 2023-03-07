import java.util.*;

	class C1
{
 String a = "Addition is : ";
   void add()
 {
   System.out.println(a + " = " + (11 + 12));
 }
}
	class C2 extends C1
  {
    String b = " Subtraction is : ";
   void sub()
   {
    int d = 22*20;
     System.out.println(a + " = " + d);
      super.add();
   }
}
	class C4 extends C2
  {
    String c = " Multiplication is : ";
   void multi()
   {
    //int e = 22-20;
     System.out.println(b + " = " + (12));
      super.add();
   }
  }
   class Add extends C4
    {
    public static void main(String args[])
     {
     
      Add obj = new Add ();
        obj.multi(); 
     }
    }