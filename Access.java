import java.util.*;

 class Access
{
  Scanner sc = new Scanner(System.in);

      private int addition()
{
       System.out.println("Enter A Value : ");
        int a = sc.nextInt();
       System.out.println("Enter B Value : ");
        int b = sc.nextInt();
         int c = a+b;
	    System.out.println("Addition : " + a + "+" + b + "=" + c);

	return c;
}
 	public String emailcheck()
{
	 String email,result;
	  System.out.println("Enter Your Email : ");
           email = sc.nextLine();

	if(email.contains("mahe@gmail.com"))
{
	 result = "Given " + email + " is an email ";
	System.out.println(result);
} else {
	 result = "Given " + email + " is an not email,please check ";
	System.out.println(result);

}
     return result;
}

	public static void main(String args[])
{
        Access m = new Access();
	m.emailcheck();
	m.addition();
}
}
