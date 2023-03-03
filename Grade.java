import java.util.*;

class Grade
{
 public static void main(String[] args)
{
  Scanner input = new Scanner(System.in);
   System.out.println("Enter Your Mark");
    int mark = input.nextInt();
     if (mark<=35){
    System.out.println("Grade D");
}
    else if (mark>35 & mark<=50){
    System.out.println("Grade C");
}
    else if (mark>50 & mark<=70){
    System.out.println("Grade B");
}
    else if (mark>70 & mark<=95){
    System.out.println("Grade A"); 
}
    else if (mark>95 & mark<=100){
    System.out.println("Grade S");
} 
    else if (mark>100){
    System.out.println("Invalid");
}
    else{
    System.out.println("Wrong");
}

}    

}