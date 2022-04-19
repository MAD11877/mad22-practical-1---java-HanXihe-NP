import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int numberOfEntries = in.nextInt();
    ArrayList<Integer> intList = new ArrayList<>();
    for(int i = 1;
        i <= numberOfEntries;
        i++){
            int userInput = in.nextInt();
            intList.add(userInput);
        }
        
    Integer[] intArray = new Integer[intList.size()];
    intList.toArray(intArray);
    
    int temp = 0;
    for(int i = 0;
        i < intArray.length;
        i++){
            for(int n = 1;
            n < intArray.length - i;
            n++){
                if(intArray[n-1] > intArray[n]){
                    temp = intArray[n-1];
                    intArray[n-1] = intArray[n];
                    intArray[n] = temp;
                }
            }
        }
    
    int tempVal = 1;
    int tempVal2 = 1;
    int mode = intArray[0];
     for(int i=1;
        i<intArray.length;
        i++){
        if(intArray[i-1] == intArray[i]){
            tempVal++;
        }
        else {
            tempVal = 1;
        }
        if(tempVal >= tempVal2){
            mode = intArray[i];
            tempVal2 = tempVal;
        }
    }
    
    System.out.println(mode); 
  }
}
