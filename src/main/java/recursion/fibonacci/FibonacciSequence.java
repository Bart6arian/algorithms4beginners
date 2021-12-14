package recursion.fibonacci;

public class FibonacciSequence {

    public static long fibo(int x) {
        if(x<2)
            return x;
        else
            return fibo(x-1) + fibo(x-2);
    }

    //Fibonacci sequence
        /*for(int x =1; x< 20; x++) {
            System.out.println("fibo["+x+"]= " + fibo(x));
        }*/
}
