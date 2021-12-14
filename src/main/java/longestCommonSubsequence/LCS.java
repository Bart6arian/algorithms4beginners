package longestCommonSubsequence;

public class LCS {

    public static int LCS_length(String x, String y, int [][]C) {
        int i, j;
        int M = x.length();
        int N = y.length();

        for(i = 0; i < M; i++)
            C[i][0] = 0;
        for(i = 0; i < N; i++)
            C[0][i] = 0;

        for(i = 1; i < M+1; i++)
            for(j = 1; j < N+1; j++)
                if(x.charAt(i-1) == y.charAt(j-1))
                    C[i][j] = C[i-1][j-1] + 1;
                else
                    C[i][j] = Math.max(C[i][j-1], C[i-1][j]);
                return C[M][N];
    }
}
