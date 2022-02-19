package KiccsDhack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximumDifference {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while(t > 0)
        {
            int n = fr.nextInt();
            int m = fr.nextInt();
            int maxRes = Integer.MIN_VALUE;
            int diffValue;
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                {
                    matrix[i][j] = fr.nextInt();
                }
            }
            for(int i = 0; i < n; i++)
            {
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int j = 0; j < m; j++)
                {
                    max = Math.max(matrix[i][j], max);
                    min = Math.min(matrix[i][j], min);
                }
                diffValue = max - min;
                maxRes = Math.max(diffValue, maxRes);
            }
            System.out.println(maxRes);
            t--;
        }
    }
}
