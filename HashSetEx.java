import java.util.*;

 class HashSetEx
{
 public static void main(String args[])
  {

	HashSet<String> m = new HashSet<String>();
	m.add("Saba");
	m.add("Mahi");
	m.add("Prithi");
	m.add("Jeeva");
	m.add("Sanjay");
        System.out.println(m);

	Iterator itr = m.iterator();
        System.out.println("Friends Names Are : ");
	  while(itr.hasNext())
  {
        System.out.println(itr.next());
  }
 }
}