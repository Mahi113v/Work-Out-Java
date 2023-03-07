import java.util.*;

 interface printable
{
   void print();
}
  class Abstraction implements printable
 {
   public void print()
  {
     System.out.println(" User Interface Using Abstaction is Achieved!!! ");
  }

     public static void main(String args[])
   {
     Abstraction m = new Abstraction ();
        m.print();
   }
  }