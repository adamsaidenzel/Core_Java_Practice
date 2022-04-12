import java.util.Scanner;

 

class TwoDim {
  public static void main(String[] args)
  {

 

    

 

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row and column size");

 

    int row = sc.nextInt();
    int col = sc.nextInt();
    
    int[][] arr = new int[row][col];
    System.out.println("Enter elements into the array");
    for(int i = 0; i < row; i++)
      {
        for(int j = 0; j < col; j++)
          {
            arr[i][j] = sc.nextInt();
            
          }
      
      }

 

    for(int i = 0; i < row; i++)
      {
        for(int j = 0; j < col; j++)
          {
            System.out.print(arr[i][j]+" ");
          }
        System.out.println();
      
      }
    int max = arr[0][0];

 

    int ind1 = 0, ind2 = 0;

 

    for(int i = 0; i < row; i++)
      {
        for(int j = 0; j < col; j++)
          {
            if(arr[i][j] > max)
            {
              max = arr[i][j];
              ind1 = i;
              ind2 = j;
            }
          }
      }

 

    System.out.println("Maximum number is "+max+ " and position is [" +ind1+"][" +ind2+ "].");

 

    
  }

 


  
}