import java.util.*;

 class LinkedListEx
{
 public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Friends Name  : ");
	LinkedList<String> n  = new LinkedList<String>();
	 n.add(sc.nextLine());
	 n.add(sc.nextLine());
	 n.add(sc.nextLine());
	 n.add(sc.nextLine());
	 n.add(sc.nextLine());
	 n.add(sc.nextLine());
	 n.add(sc.nextLine());
	 n.add(sc.nextLine());

	Iterator it = n.iterator();

	  System.out.println("Enter Your 8 Values  : "); 
	LinkedList<Integer> al  = new LinkedList<Integer>();
	 al.add(sc.nextInt());
	 al.add(sc.nextInt());
	 al.add(sc.nextInt());
	 al.add(sc.nextInt());
	 al.add(sc.nextInt());
	 al.add(sc.nextInt());
	 al.add(sc.nextInt());
	 al.add(sc.nextInt());

	Iterator itr = al.iterator();
           System.out.println("Friends Are : ");
	  while(it.hasNext())
  {
           System.out.println(it.next());
  }
	  while(itr.hasNext())
  {
           System.out.println(itr.next());
  }
 }
}