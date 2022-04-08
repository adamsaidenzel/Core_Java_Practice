import java.util.Scanner;
class Example1{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    float basicsalary,hra,da,grosssalary;
    System.out.println("Enter basic salary");
    basicsalary=s.nextFloat();
    hra=(67*100)/basicsalary;
    da=(67*100)/basicsalary;
    grosssalary=basicsalary+hra+da;
    System.out.println("gross salary= " +grosssalary);
  }
}