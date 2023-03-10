import java.util.*;

 public class ArrayDeQueue
{
  public static void main(String[] args)
 {
	Deque<String> m = new ArrayDeque<String>();
	  m.add("Mahi");
	  m.add("Sabari");
	  m.add("Sanjay");

	for (String str : m)
  {
	   System.out.println(str);
  }
 }
}