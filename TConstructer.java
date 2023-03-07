import java.util.*;

 class Constructer
{
  int id;
   String name;
    float salary;

    Constructer(int i, String n, float s)
 {
      id =i;
        name =n;
          salary=s;
 }
    void display()
  {
     System.out.println(id + " " + name + " " + salary);
  }
 }
  public class TConstructer{
    public static void main(String[] args)
   {
	Constructer a = new Constructer(101,"Mahi",45000);
	 Constructer b = new Constructer(102,"Priya",35000);
	  Constructer c = new Constructer(103,"Sanjay",40000);
	a.display();
	 b.display();
	  c.display();

   }
}