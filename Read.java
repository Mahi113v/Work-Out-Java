import java.io.*;

class Read{


	public static void main(String[] args) throws IOException{

		char c;
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		System.out.println("Enter Line of Text");
 		 System.out.println("Enter 'q' to quit.");

		do {

			c = (char) br.readLine();
			System.out.println(c);
		}while(c != q);

	}

}