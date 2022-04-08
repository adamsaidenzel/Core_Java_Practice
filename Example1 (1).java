import java.util.Scanner;
class Example1
  {
    public static void main(String args[])
    {
      int i=1,f=1;
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=s.nextInt();

      while(i<=n)
        {
          f=f*i;
          System.out.println(+f);
            i++;
        }
      System.out.println("the factorial of a number +f");
      
    }
  }