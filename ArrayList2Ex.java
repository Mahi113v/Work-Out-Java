import java.util.*;

 class ArrayList2Ex
{
 public static void main(String args[])
  {

	ArrayList<String> list = new ArrayList<String>();
	  list.add("Mahi");
	  list.add("Sarun");
	  list.add("Loki");
	  list.add("Mahi");
	  list.add("113");
            System.out.print(list);
		list.remove(113);
                 System.out.print(list);

	Iterator itr = list.iterator();
        System.out.print("Friends Names Are :");
	  while(itr.hasNext())
  {
        System.out.print(itr.next());
  }
 }
}