import java.util.*;

class Mahe{

public static void main(String[] args)
{

 System.out.println("Enter Your Name");
 Scanner input = new Scanner(System.in);
 String name = input.nextLine();
 System.out.println(name);
 
 System.out.println("Initial");
 String initial = input.nextLine();
 System.out.println(initial);

 System.out.println(" Enter Your MailId");
 String mail = input.nextLine();
 System.out.println(mail);
 
 System.out.println(" Enter Your Password");
 int password = input.nextInt();
 System.out.println(password);
 
 System.out.println(" Enter Your Family");
 int confirm = input.nextInt();
 System.out.println(confirm);

 System.out.println(" Enter Your Date of Birth");
 double date = input.nextDouble();
 System.out.println(date);

 System.out.println("Enter Your Age");
 short age = input.nextShort();
 System.out.println(age);

 System.out.println(" Enter Your Family Count");
 byte count = input.nextByte();
 System.out.println(count);

 System.out.println(" Enter Your Age and Month");
 float month = input.nextFloat();
 System.out.println(month);

 System.out.println("Enter Your Mobile Number");
 long number = input.nextLong();
 System.out.println(number);

}
}