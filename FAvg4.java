import java.util.*;

 class FAvg4
{
  public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of A : ");
      int a = sc.nextInt();
     System.out.println("Enter the value of B : ");
      int b = sc.nextInt();
     System.out.println("Enter the value of C : ");
      int c = sc.nextInt();
     System.out.println("Enter the value of D : ");
      int d = sc.nextInt();
     System.out.println("Enter the value of E : ");
      int e = sc.nextInt();
	int sum = a+b+c+d+e;
         float avg;
	{
	   
        System.out.println("Addition of numbers :" + a + " + " + b + " + " + c + " + " + d + " + " + e + " + "+"="+" " + sum );  
         
	}
		//for (i=0;i<5;i++)
		//{
		   //n = in.nextInt();
			//s +=n;
	//}
	avg = sum / 5;
	System.out.println("The Average of 5 Number is : " + sum + " / " + 5 + " = " + avg);
 
}
}