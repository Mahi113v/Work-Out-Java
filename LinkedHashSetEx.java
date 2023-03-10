import java.util.*;

 class LinkedHashSetEx
{
 public static void main(String args[])
  {

	LinkedHashSet<String> m = new LinkedHashSet<String>();
	  m.add("Saba");
	  m.add("Mahi");
	  m.add("Prithi");
	  m.add("Jeeva");
	  m.add("Sanjay");
	  m.add("Mahi");
	  m.add(" ");
	   System.out.println(m);

	Collections.sort(list);
	   System.out.println(list);
	Collections.sort(list, Collections.reverseOrder());
	   System.out.println(list);

	Iterator itr = m.iterator();
	   System.out.println("Friends Names Are : ");
	 while(itr.hasNext())
  {
	   System.out.println(itr.next());
  }
 }
}