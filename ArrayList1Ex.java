import java.util.*;

 class ArrayList1Ex
{
 public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Friends Name is : ");

  ArrayList<String> list = new ArrayList<String>();
     list.add(sc.nextLine());
     list.add(sc.nextLine());
     list.add(sc.nextLine());
     list.add(sc.nextLine());
        System.out.println(list);

	Iterator itr = list.iterator();
        System.out.println("Friends Names Are : ");
	  while(itr.hasNext())
  {
        System.out.println(itr.next());
  }
 }
}