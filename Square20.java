import java.util.*;

 class Square20
{
  public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Number : ");
	int n = sc.nextInt();
      System.out.println("The Square Root is : " + n + " = " + squareRoot(n));
 }

   public static double squareRoot(int num)
  {
     double t;
      double sqrt = num / 2;

    do
    {
      t = sqrt;
        sqrt = (t + (num / t)) / 2;
    }
    while((t - sqrt) != 0);
     return sqrt;
 }
}