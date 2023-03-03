import java.util.*;

 class Row
{
  public static void main(String[] args)
{

   Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Table Value :");
       int a  = sc.nextInt();
     System.out.println("Enter the rows in the matrix :");
       int b  = sc.nextInt();
     System.out.println("Enter the columns in the matrix :");
       int c  = sc.nextInt();

	int x[][][] = new int[a][b][c];

	for(int i = 0; i<a ; i++)
{		
	 for(int j = 0; j<b ; j++)
{
	  for(int k = 0; k<c ; k++)
{
             System.out.println("Enter the Array Values : ");
		x[i][j][k] = sc.nextInt();
}
}
}
	for(int i = 0; i < a ; i++)
{		
  	 for(int j = 0; j < b ; j++)
{
	  for(int k = 0; k < c ; k++)
{
	   System.out.print(x[i][j][k] + " ");
}
		System.out.print("\t");
}
		  System.out.println();
}

}
}