public class Fibonacci {
    public static int fibonacciRecursion(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        if(n==1||n==2)
        {
            return 1;
        }
        return  fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
    }
    public static void main(String[] args){
        int maxnum=10;
        System.out.println("fibonacci series of"+maxnum+"numbers:");
        for(int i=0;i<maxnum;i++)
        {
            System.out.println(fibonacciRecursion(i)+" ");
        }
    }
}

