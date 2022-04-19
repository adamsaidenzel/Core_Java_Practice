// import ArrayList
import java.util.ArrayList;

 

// main class
class ArrayList1 
  {
    // main method
    public static void main(String[] args)
    {
      // create an object
      ArrayList<Integer> al = new ArrayList<Integer>();
      
      al.add(10);
      al.add(20);
      al.add(30);
      al.add(40);
      al.add(50);
      al.add(60);
      al.add(70);
      al.add(80);
      al.add(90);
      al.add(100);
      

 

      System.out.print(al);
      
      System.out.println();

 

      // for loop
      for(int i = 0; i < al.size(); i++)
        {
          // al.remove(i);
          if(i % 3 == 0)
          {
            al.remove(i); // i = 9(100), 6(70) , 3(40)
            // 10, 50, 90 are being removed
          }
        }
      System.out.print(al);
      
      System.out.println();
      
    }
  }