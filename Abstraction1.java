import java.util.*;

 interface Drawable
{
	void draw();
	void draw1();
}
  class Rectangle implements Drawable
 {
   public void draw()
  {
    System.out.println(" Drawing Rectangle ");
  }
 }
  class Circle implements Drawable
   {
    public void draw1()
    {
      System.out.println(" Drawing Circle");
    }
   }
  class Abstraction1 
     {
      public static void main(String args[])
      {
        Drawable m = new Rectangle();
	 Drawable n = new Circle();
        m.draw();
        n.draw1();

      }
     }