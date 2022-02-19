package KiccsDhack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StrongestStillWeakest {
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
        int n = fr.nextInt();
        int m = fr.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                matrix[i][j] = fr.nextInt();
            }
        }
        int maxInGrp = 0;
        int temp = 0;
        boolean flag;
        boolean hasSoldier = false;
        for(int i = 0; i < n; i++)
        {
            flag = false;
            maxInGrp = Integer.MIN_VALUE;
            for(int j = 0; j < m; j++)
            {
                if (matrix[i][j] > maxInGrp) {
                    maxInGrp = matrix[i][j];
                    temp = j;
                }
            }
            for(int k = 0; k < n; k++)
            {
                if (matrix[k][temp] < maxInGrp) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                hasSoldier = true;
                System.out.println("MAX:" + maxInGrp + "Yes");
                break;
            }
        }
        if(!hasSoldier)
            System.out.println("No");
        System.out.println(maxInGrp);
    }
}
