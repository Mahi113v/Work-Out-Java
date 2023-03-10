import java.util.*;

 class TreeSetEx
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
	   System.out.println(m);

	//Collections.sort(m);
	   //System.out.println(m);
	//Collections.sort(m, Collections.reverseOrder());
	   //System.out.println(m);

	Iterator itr = m.iterator();
	   System.out.println("Friends Names Are : ");
	 while(itr.hasNext())
  {
	   System.out.println(itr.next());
  }
 }
}