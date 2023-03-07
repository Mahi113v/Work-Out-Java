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
  class Cat extends Animal
   {
  void meow()
    {
    System.out.println("Meowing...");
    }
   }
 class HInterface  // Hierarchial
    {
      public static void main(String[] args)
     {
        Cat m = new Cat();
	  m.meow();
	   m.eat();
	Dog v = new Dog();
	   v.bark();
	    v.eat();
     }
    }