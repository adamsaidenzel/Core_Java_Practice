public class Example3  {

  public static void main(String args[]){

    System.out.println("HI");
    try{
          System.out.println(10/0);
      try{
      System.out.println("hi");
        }
      catch(Exception e1){
        System.out.println("hello");
      }
               
    }
    catch(Exception e){
      System.out.println("outer catch");
    }
    System.out.println("Bye");
    
    }
  
}