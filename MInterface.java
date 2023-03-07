import java.util.*;

 class Animal
{
  void eat()
 {
   System.out.println("Eating...");
 }
}
  class Dog extends Animal
  {
  void eat()
   {
    System.out.println("Barking...");
   }
  }
 class MInterface  // Multiple
    {
      public static void main(String[] args)
     {
        Dog m =new Dog();
	    m.eat();
     }
    }