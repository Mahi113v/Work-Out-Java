import java.util.*;

 class Student
{
   long rollno;
   String name;
   static String college = "ITS";

    static void change()
{
    college = "SRIET";
}
  Student ( long r, String n)
{
   rollno = r;
   name = n;
} 
    void display()
{
     System.out.println(rollno+"\t"+name+"\t"+college);
}
}
  public class TestStaticMethod
{
   public static void main(String args[])
{
      Student.change();
	Student a = new Student ( 123 , "Mahi");
	 Student b = new Student (124 , "Jeeva");
	   Student c = new Student (125 , "Sanjay");
	a.display();
	 b.display();
	  c.display();
}
}