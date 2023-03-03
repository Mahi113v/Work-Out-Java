import java.util.Scanner;

public class Matrix1 {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the rows in the matrix");
		int row = sc.nextInt();
		System.out.println("Please enter the columns in the matrix");
		int column = sc.nextInt();

		int[][] a = new int[row][column];
		int[][] b = new int[row][column];
		int[][] d = new int[row][column];

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.println(String.format("Enter first[%d][%d] integer", r, c));
				a[r][c] = sc.nextInt();
			}
		}

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.println(String.format("Enter second[%d][%d] integer", r, c));
				b[r][c] = sc.nextInt();
			}
		}		
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				System.out.println(String.format("Enter second[%d][%d] integer", r, c));
				d[r][c] = sc.nextInt();
			}
		}

		sc.close();

		System.out.println("First Matrix:\n");
		print2dArray(a);

		System.out.println("Second Matrix:\n");
		print2dArray(b);

		System.out.println("Third Matrix:\n");
		print2dArray(d);
}

	private static void print2dArray(int[][] matrix) {
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				System.out.print(matrix[r][c] + "\t");
			}
			System.out.println();
		}
	}
}