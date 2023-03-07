import java.util.*;

class DBConversion
{    
  public static void toBinary(int decimal){    
     int binary[] = new int[40];    
      int index = 0;    
     while(decimal > 0)
 {    
       binary[index++] = decimal%2;    
        decimal = decimal/2;    
 }    
     for(int i = index-1;i >= 0;i--)
  {    
       System.out.print(binary[i]);    
  }    
       System.out.println();
}    
  public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter the Decimal Number is : ");
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  int c = sc.nextInt();
	  int d = sc.nextInt();
	   toBinary(a);
	   toBinary(b);
	   toBinary(c);
	   toBinary(d);
	//System.out.println("Decimal of 21 is: ");  
	   //toBinary(21);
	//System.out.println("Decimal of 31 is: ");    
	   //toBinary(31);  
   }
}