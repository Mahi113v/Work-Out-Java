import java.util.*;

class Assignment
{

 public static void main(String[] args)

{

 int a = 10;
 int b = 25;
 a +=b;
 b -=a;
 String value = (a==b)?"a+b":"b-a";
 System.out.println(value);
 System.out.println(b);
 System.out.println(a);
 System.out.println("Enter Value of a");
 Scanner input = new Scanner(System.in);
 int c = input.nextInt();
 System.out.println(c);

}

}
