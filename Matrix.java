import java.util.Scanner;

class Matrix
{
  public static void main(String[] args)
{
  Scanner input = new Scanner(System.in);
   System.out.println("Please enter the rows in the matrix");
     int row = input.nextInt();
       System.out.println("Please enter the columns in the matrix");
	 int column = input.nextInt();

	   int[][] a = new int[][];
	   int[][] b = new int[][];

	for (int r = 0; r < row; r++)
{
	  for (int c = 0; c < column; c++)
{
		System.out.println(String.format("Enter a[%d][%d] integer", r, c));
		  a[r][c] = input.nextInt();
}
}

	for (int r = 0; r < row; r++)
{
	  for (int c = 0; c < column; c++)
{
            System.out.println(String.format("Enter b[%d][%d] integer", r, c));
		b[r][c] = input.nextInt();
}
}
}
}