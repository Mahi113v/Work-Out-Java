import java.util.*;

 class StackListEx
{
 public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Friends Name  : ");

  Stack<String> m = new Stack<String>();
     	m.push(sc.nextLine());
     	m.push(sc.nextLine());
	 m.pop();
     	m.push(sc.nextLine());
     	m.push(sc.nextLine());
	 m.pop();
     	m.push(sc.nextLine());
     	m.push(sc.nextLine());
	 m.pop();
           System.out.println(m);

	Iterator itr = m.iterator();
        System.out.println("Friends Names Are : ");
	  while(itr.hasNext())
  {
        System.out.println(itr.next());
  }
 }
}