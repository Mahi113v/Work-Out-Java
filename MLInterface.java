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
  void bark()
   {
    System.out.println("Barking...");
   }
  }
  class BabyDog extends Dog
   {
  void weep()
    {
    System.out.println("Weeping...");
    }
   }
 class MLInterface  // MultiLevel
    {
      public static void main(String[] args)
     {
        BabyDog m =new BabyDog();
	  m.weep();
	   m.bark();
	    m.eat();
     }
    }