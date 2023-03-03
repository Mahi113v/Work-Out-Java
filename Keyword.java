import java.util.*;

  class Key
{
    void n()
{
      System.out.println(this);
       Key b = new Key(this);
}
}
 class Keyword1
{
  public static void main(String args[])
{
     Key a = new Key();
      System.out.println(a);
}
}
