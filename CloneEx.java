import java.util.*;

 class CloneEx implements Cloneable
{
	int rollno;
	 String name;

  CloneEx(int rollno, String name)
 {
	this.rollno = rollno;
	  this.name = name;
 }

  public Object clone()throws CloneNotSupportedException{

	return super.clone();
  }

  public static void main(String args[])
   {
	try{
	 CloneEx m = new CloneEx(113, "Mahi");

	  CloneEx v =(CloneEx)m.clone();

	System.out.println(m.rollno + " " + m.name);
	  System.out.println(v.rollno + " " + v.name);
     
	}catch(CloneNotSupportedException c){}
  }
}
