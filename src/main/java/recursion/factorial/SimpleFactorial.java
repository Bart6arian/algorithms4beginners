package recursion.factorial;

public class SimpleFactorial {

    static long factorial(int x) {
        if(x==0)
            return 1;
        else
            return x*factorial(x-1);
    }
}
