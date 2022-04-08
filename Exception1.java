public class Exception1  {

  public static void main(String args[]){
  
    System.out.println("HI");
    try{
    System.out.println(10/0);
      }
    catch(Exception e){
      System.out.println("We can't devide with zero");
    }
    
    System.out.println("Bye");
    
    } 
}