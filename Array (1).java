import java.util.Scanner;

class Array{
  
public static void main(String[] args) {
    // create Scanner class object to take input
    Scanner scan = new Scanner(System.in);

    // read size of the array
    System.out.print("Enter size of the array: ");
    int n = scan.nextInt();

    // create an int array of size n
    int numbers[] = new int[n];

    // take input for the array
    System.out.println("Enter array elements: ");
    for (int i = 0; i < n; ++i) {
      numbers[i] = scan.nextInt();
      }
  System.out.println("the negative array elements are");
  for(int i=0;i<numbers.length;i++)
  {
    if(numbers[i] < 0)
    {
      System.out.println(numbers[i]+" ");
    }
   
  }
  }
}