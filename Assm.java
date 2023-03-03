import java.util.*;

 class Assm
{
  public static void main(String[] args){

   Scanner input = new Scanner(System.in);

    int i,fact = 1;

     int m = 7;

     for(i=1;i<=m;i++)

{
    fact *=i;

      }
      System.out.println("Factorial of "+m+" is: "+fact);

   }

}