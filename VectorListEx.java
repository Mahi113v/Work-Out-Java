import java.util.*;

 class VectorListEx
{
 public static void main(String args[])
  {

  Vector<String> m = new Vector<String>();
     m.add("Mahi");
     m.add("Prithi");
     m.add("Mahi");
     m.add("Saba");
     m.add("Mahi");

	Iterator<String> itr = m.iterator();
        System.out.println("Friends Names Are : ");
	  while(itr.hasNext())
  {
        System.out.println(itr.next());
  }
 }
}