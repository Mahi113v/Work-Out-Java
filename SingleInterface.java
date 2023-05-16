import java.util.*;

 class Animal
{
  void eat()
 {
   System.out.println("eating...");
 }
  class Dog extends Animal
  {
  void bark()
   {
   System.out.println("barking...");
   }
  }
 class SingleInterface
    {
      public static void main(String args[])
     {
        Dog m = new Dog();
	  m.bark();
	   m.eat();
     }
    }
}