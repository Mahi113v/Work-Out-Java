import java.util.*;

 class Space11
{
  public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Paragraph : ");
       String m = sc.nextLine();
        int letter = 0;
         int space = 0;
          int digit = 0;
             char ch[] = m.toCharArray();

	for (int i = 0; i < m.length (); i++ )
   {
   if(Character.isLetter(ch[i]))
    {
       letter++;
    }
   else if(Character.isSpaceChar(ch[i]))
     {
      space++;
     }
   else if(Character.isDigit(ch[i]))
      {
      digit++;
      }
   else {
         }
    }
	System.out.println("Letter are: "+letter);
	 System.out.println("Space are: "+space);
	  System.out.println("Digit are: "+digit);  
 }
}