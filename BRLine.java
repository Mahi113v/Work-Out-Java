import java.io.*;

class BRLine{


	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

 	       String str;
		System.out.println("Enter Line of Text");
 		 System.out.println("Enter 'end' to quit.");

		do {

			str = br.readLine();
			System.out.println(str);
		}while(!str.contains("end"));

	}

}