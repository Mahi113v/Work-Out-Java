import java.util.*;

 class StackEx
{
 public static void main(String args[])
  {

  Stack<String> m = new Stack<String>();
	m.push("Mahi");
	m.push("Saba");
	m.push("Mahi");
	m.push("Prithi");
	 m.pop();
	m.push("Jeeva");
	m.push("Sanjay");
        System.out.println(m);

	Iterator itr = m.iterator();
        System.out.println("Friends Names Are : ");
	  while(itr.hasNext())
  {
        System.out.println(itr.next());
  }
 }
}