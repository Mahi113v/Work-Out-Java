import java.util.*;
 
class Constrecder
{
 int rollno;
 String name;
 float fee;

 Constrecder (int rollno,String name,float fee){
  this.rollno = rollno;
  this.name = name;
  this.fee = fee;
}
  void display()
{
   System.out.println(rollno + " " + name + " " + fee);
}
}
  class Test
{
   public static void main(String args[])
{
   Constrecder a = new Constrecder( 123 , "Mahi" , 5000f);
   Constrecder b = new Constrecder( 124 , "Saba" , 6000f);
  
    a.display();
    b.display();
}
}