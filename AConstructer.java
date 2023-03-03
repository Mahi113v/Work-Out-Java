import java.util.*;

 class Argument
{
   arg a;
    Argument(arg a)
{
     this.a=a;
}
  void display()
{
    System.out.println(a.data);
}
}

    class arg
{
      int data=10;
        arg()
{
      Argument b = new Argument(this);
       b.display();
}
}
 public class AConstructer
{
  public static void main(String args[])
{
       arg c = new arg();
}
}