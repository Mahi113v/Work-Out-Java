import java.util.*;

 class Human
{
  void showhuman()
 {
   System.out.println("Invoking Human Method!!!");
 }
}
  interface Father
  {
     public void show();
  }
  interface Mother
   {
     public void show();
   }
  class Child extends Human implements Father, Mother
     {
       public void show()
      {
	  System.out.println("Invoking Show Method ");
      }
	public void showchild()
       {
            System.out.println("Invoking Show Child Method ");
       }
      }
 class HBInterface  // Hybrid
    {
      public static void main(String[] args)
     {
        Child m = new Child();
	  m.showhuman();
	    m.show();
	      m.showchild();
     }
    }