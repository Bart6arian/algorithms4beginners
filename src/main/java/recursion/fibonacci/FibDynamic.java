package recursion.fibonacci;

public class FibDynamic {

    //iter version of recursive Fibonacci algorithm
    public static void fibDynamic(int x, long f[]) {
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i < x; i++)
            f[i] = f[i-1] + f[i-2];
    }

    /*final int N = 25;
    long f[] = new long[N];
    fibDynamic(N, f);
        for(int i = 0; i < N; i++)
            System.out.println("fibDynamic(" +i+")= " +f[i]);*/
}
