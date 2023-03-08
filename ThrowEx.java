import com.mahesh.Class1;

//import java.util.*;

 public class ThrowEx
{
  public static void validate(int age)
  {
	if ( age <= 18 ) {
	  throw new ArithmeticException("Thambi Nee Innum Valaranum!!!");
		//System.out.println("Thambi Nee Innum Valaranum!!!");
   } else {
	    System.out.println("Alright! You Are Eligible in 13/06/2024 ");
}
}
   public static void main(String args[])
 {
	validate(23);
	   System.out.println("Main method");
	Class1 m1 = new Class1();
	  m1.method1();
 }
}