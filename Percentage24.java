import java.util.*;

 class Percentage24
{
  public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Tamil Mark : ");
	int tamil = sc.nextInt();
     System.out.println("Enter the English Mark : ");
	int english = sc.nextInt();
     System.out.println("Enter the Maths Mark : ");
	int maths = sc.nextInt();
     System.out.println("Enter the Physics Mark : ");
	int physics = sc.nextInt();
     System.out.println("Enter the Chemistry Mark : ");
	int chemistry = sc.nextInt();
     System.out.println("Enter the Biology Mark : ");
	int biology = sc.nextInt();
 	 double CGPA = (tamil + english + maths + physics + chemistry + biology) / (600.0); 
	   double CGPAper = (maths * (CGPA));

	System.out.println("CGPA percentage is : " + tamil + " + " + english + " + " + maths + " + " + physics + " + " + chemistry + " + " + biology + " + " + " = " + CGPAper);
 }
}