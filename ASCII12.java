import java.util.*;

 class ASCII12
{
  public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Character of M : ");
       char m = sc.next().charAt(0);
	//String ch = "AEKMV";
	 //int b = 0;
	 int asciivalue = m;

	//for(int i = 0; i < ch.length(); i++){
	//int asciivalue = ch.charAt(i);
         //b = b + ascii;}
	 System.out.println("ASCII value of " + m + " = " + asciivalue);
 }
} 