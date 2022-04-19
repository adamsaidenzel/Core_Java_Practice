// import arrays
import java.util.Arrays;

 

// main class
class BubbleSortExample1
  {

 

    // user-defined method bubble()
    static void bubble(int arr[])
    {
      int length = arr.length;
      for(int i = 0; i < length; i++)
        {
          for(int j = 1; j < length - i ; j++) 
            {
              if(arr[j-1] > arr[j])
              {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
              }
            }
        }
      System.out.println(Arrays.toString(arr));
    }

 

    // main method
    public static void main(String[] args)
    {
     
       int arr[] = {9,8,7,6,5,4,3};
      bubble(arr);
    }
  }