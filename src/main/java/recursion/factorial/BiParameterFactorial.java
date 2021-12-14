package recursion.factorial;

public class BiParameterFactorial {

    static long advFactorial(int x, long n){
        if(x==0)
            return n;
        else
            return advFactorial(x-1, x*n);
    }
}
