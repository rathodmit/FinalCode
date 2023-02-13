
package arithmetic;

import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */

public class Arithmetic 
{

   
    public static void main(String[] args) 
    {
       
        ArithmeticBase r= new ArithmeticBase();
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int m= in.nextInt();
        double result = r.calculate(m,n);
        System.out.println("result :" +result); 
    
    }
}

