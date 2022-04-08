public class Example2  {

  public static void main(String args[]){

    System.out.println("HI");
    try{
           System.out.println("Before try");
      String str=null;
      System.out.println(str.toUpperCase());
                 System.out.println("After try");
    }
    catch(Exception e){
      System.out.println("Catch block");
    }
    System.out.println("Bye");
    
    }
  
}