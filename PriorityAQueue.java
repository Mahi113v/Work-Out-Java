import java.util.*;

 public class PriorityAQueue  // Priority Array Queue
{
  public static void main(String args[])
 {
	PriorityQueue<String> m = new PriorityQueue<String>();
	  m.add("Mahesh Kuamr");
	  m.add("Sabari Watson");
	  m.add("Jeeva Sanjay");
	  m.add("Kumar");
	    System.out.println("head : " + m.element());
	    System.out.println("head : " + m.peek());
	    System.out.println("Iterating The Queue Elements : ");

	Iterator itr = m.iterator();
	  while(itr.hasNext())
  {
		System.out.println(itr.next());
  }
	  m.remove();
	  m.poll();
	    System.out.println("After Removing Two Elements : ");

	Iterator<String> it = m.iterator();
	  while(it.hasNext())
   {
		System.out.println(it.next());
   }
 }
}