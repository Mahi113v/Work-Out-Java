import java.util.*;

 class Copy
{
int id;
String name;
Copy(int i,String n){
id = i;
name = n;
}
Copy(Copy s){
id = s.id;
name =s.name;
}
void display()
{
  System.out.println(id+" "+name);
}
}
 class CopyConstructer
{
   public static void main(String args[])
{
   Copy a = new Copy(123,"Mahi");
    Copy b = new Copy(a);
   a.display();
    b.display();
}
}