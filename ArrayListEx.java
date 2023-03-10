import java.util.*;

 class ArrayListEx
{
 public static void main(String args[])
  {

	ArrayList<String> list = new ArrayList<String>();
	  list.add("Mahi");
	  list.add("Sarun");
	  list.add("Loki");
	  list.add("Mahi");
	     System.out.println(list);
	list.remove(list);
	     System.out.println(list);
	//list.removeAll(list);
	     //System.out.print(list);

	Collections.sort(list);
	   System.out.println(list);
	Collections.sort(list, Collections.reverseOrder());
	   System.out.println(list);

	Iterator itr = list.iterator();
        System.out.print("Friends Names Are :");
	  while(itr.hasNext())
  {
        System.out.println(itr.next());
  }
 }
}