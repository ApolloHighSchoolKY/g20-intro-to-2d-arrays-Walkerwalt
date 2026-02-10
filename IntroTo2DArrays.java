import java.util.Arrays;
import java.util.Collections;

public class IntroTo2DArrays{

  public static void main(String[] args){
    
    int[][] twoDee = new int[3][5];
    
    //Store incremental values in row major order
    int addNow = 1;

    for (int row = 0; row < twoDee.length; row++)
    {
      for (int col = 0; col < twoDee[row].length; col++)
      {
        twoDee[row][col] = addNow;
        addNow ++;
      }

      System.out.println(Arrays.toString(twoDee[row]));
    }

    //Print out total sum of each row in the following format 
    //Row 0: 15
    //Row 1: ...
    int rowSum = 0;

     for (int row = 0; row < twoDee.length; row++)
    {
      for (int col = 0; col < twoDee[row].length; col++)
      {
        rowSum += twoDee[row][col];
      }

      System.out.println("Row " + row + ": " + rowSum);
      rowSum = 0;
    }

    //Print sum of each column in following format
    // column 0: ??
    // column 1: ??
    //...
    
    int sum = 0;

    for (int col = 0; col < twoDee[0].length; col++)
    {
      for (int row = 0; row < twoDee.length; row++)
      {
        sum += twoDee[row][col];
      }

      System.out.println("Col " + col + ": " + sum);
      sum = 0;
    }
  }
}
