import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int userInt = in.nextInt();
    int i, n;
    
    for(i = 1;     // Increments by 1 from 1 to userInt 
        i <= userInt;
        i++){
            for(n = userInt;     // Decrements by 1 from userInt to 1
                n >= i;
                n--){
                    System.out.print("*");
                }
            System.out.println("");
        }
  }
}
