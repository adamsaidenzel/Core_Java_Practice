public class Example1  {

  public static void main(String args[]){

    System.out.println("HI");
    try{

      String str=null;
      System.out.println(str.toUpperCase());
    }
    catch(Exception e){
      System.out.println("Catch block");
    }
    System.out.println("Bye");
    
    }
  
}