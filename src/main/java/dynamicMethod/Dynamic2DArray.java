package dynamicMethod;

public class Dynamic2DArray {
    // find coordinates on 2dimensional array
    //A is the parameter
    public static void dynamic(double A[][]) {
        int i,j, n = A.length;
        for(i = 1; i < n; i++) {
            A[i][0] = 0;
            A[0][i] = 1;
        }
        for(j = 1; j < n; j++)
            for(i = 1; i < n; i++)
                A[i][j] = (A[i-1][j] + A[i][j-1]) /2.0;
    }

    /*int N = 5;
    double A[][] = new double[N][N];
    dynamic(A);
        for(int i = 0; i<N; i++)
            for(int j = 0; j< N; j++)
            System.out.println("A[" + i + "][" + j + "] = " + A[i][j]);*/
}
