import java.util.*;

class Overload
{
  int id;
   String name;
    int age;
     Overload(int i,String m)
{
   id = i;
    name = m;
}
    Overload(int i,String m,int a)
{
   id = i;
    name = m;
     age = a;
}
   void display()
{
     System.out.println(id+"\t"+name+"\t"+age);
}
}
 class COverload
{
  public static void main(String args[])
{
     Overload c = new Overload(123,"Mahi");
      Overload d = new Overload(124,"Vel", 23);

     c.display();
      d.display();
}
}

