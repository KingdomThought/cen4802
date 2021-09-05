public class Fibonacci

/**
 * @author KingdomThought
 * @param n Number to be Sequenced Recursively by Fibonacci Method
 * @return Returns the result of number sequenced by Fibonacci Method
 */

{
    static int fib(int n)
    
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[])
    {
    
    	
    int n = 10;
    System.out.println("The " + n + "th sequence in this fibaacci sequence is " + fib(n));
    }
}