import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
    public enum Operation
    {
     
        PLUS, MINUS,TIMES, DIVIDE;
        double apply(double x,double y)
        {
            switch (this) 
            {
               case PLUS:
                return x + y;
               case MINUS:
                return x - y;
               case TIMES:
                return x * y;
               case DIVIDE:
                return x / y;
                default:
                throw new AssertionError("Unknown operations " + this);
            }
        }
    }
 
}