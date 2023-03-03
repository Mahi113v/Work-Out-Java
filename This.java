import java.util.*;

 class Sanjay
{
  void m()
{
   System.out.println("Hello Sarun");
}
 void n()
{
   System.out.println("Hello Saba");
    m();
}
}
  class This
{
   public static void main(String args[])
{
    Sanjay v = new Sanjay();
     v.n();
}
}