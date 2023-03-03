import java.io.*;

class Byte
{
  public static void main(String args[])throws IOException
{
   ByteArrayOutputStream bOutput = new ByteArrayOutputStream(0);
    while(bOutput.size() != 12 ) 
{
     bOutput.write(System.in.read());
 }
      byte b [] = bOutput.toByteArray();
       System.out.println("Print the content");
        for (int x= 0 ; x < b.length; x++)
{
          System.out.println((char)b [x] + " ");
}
           System.out.println(" ");
  
    int c;
      ByteArrayInputStream bInput = new ByteArrayInputStream(b);
       System.out.println( " Converting characters to Upper case " );
         for(int y = 0 ; y < 1; y++)
{
           while(( c = bInput.read()) != -1)
{
             System.out.print(Character.toUpperCase((char)c));
}
               bInput.reset();
}
}
}