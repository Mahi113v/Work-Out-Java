import java.util.*;

class BDConversion
{   
  public static int getDecimal(int binary)
 {
    int decimal = 0;
    int n = 0; 
    while(true)
  {
      if(binary == 0)
   {
        break;
   } else {
          int temp = binary%10;
          decimal += temp*Math.pow(2, n);
          binary = binary/10;
          n++;
         }
  }
    return decimal;
}
  public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the Decimal Number is : ");
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  int c = sc.nextInt();
	  int d = sc.nextInt();
	System.out.println("Decimal of is : " + a + " = " + getDecimal(a));
	System.out.println("Decimal of is : " + c + " = " + getDecimal(c));
	System.out.println("Decimal of is : " + b + " = " + getDecimal(b));
	System.out.println("Decimal of is : " + d + " = " + getDecimal(d));
   }
}