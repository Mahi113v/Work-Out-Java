import java.util.*;

 class Split
{
  public static void main(String[] args)
{

   Scanner sc = new Scanner(System.in);
     System.out.println("Enter The Fun  :");
       String a  = sc.nextLine();
        String [] Arr = a.split("@", 3);

		for(String m : Arr)
{
		System.out.println("Mahe : " + m);
}
}
}