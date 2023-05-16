import java.util.*;

 class Calculator3
{
  public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value of A : ");
      int a = sc.nextInt();
     System.out.println("Enter the value of B : ");
      int b = sc.nextInt();
       int c = a+b;

     System.out.println("Enter the value of H : ");
      int h = sc.nextInt();
     System.out.println("Enter the value of I : ");
      int i = sc.nextInt();
       int d = h-i;

     System.out.println("Enter the value of J : ");
      int j = sc.nextInt();
     System.out.println("Enter the value of K : ");
      int k = sc.nextInt();
       int e = j*k;

     System.out.println("Enter the value of L : ");
      int l = sc.nextInt();
     System.out.println("Enter the value of M : ");
      int m = sc.nextInt();
       int f = l/m;

     System.out.println("Enter the value of N : ");
      int n = sc.nextInt();
     System.out.println("Enter the value of O : ");
      int o = sc.nextInt();
       int g = n%o;

     System.out.println("Product of two Numbers : " + a + "+" + b + "="+" "+ c);
     System.out.println("Product of two Numbers : " + h + "-" + i + "="+" "+ d);
     System.out.println("Product of two Numbers : " + j + "*" + k + "="+" "+ e);
     System.out.println("Product of two Numbers : " + l + "/" + m + "="+" "+ f);
     System.out.println("Product of two Numbers : " + n + "%" + o + "="+" "+ g);
}
}