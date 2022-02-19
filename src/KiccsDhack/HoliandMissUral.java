package KiccsDhack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HoliandMissUral {
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
            long min = Long.MAX_VALUE;
            long sum;
            int n = fr.nextInt();
            int k = fr.nextInt();
            long[] d = new long[n];
            long[] r = new long[n];
            for(int i = 0; i < n; i++)
            {
                d[i] = fr.nextInt();
            }
            for(int i = 0; i < n; i++)
            {
                r[i] = fr.nextInt();
            }
            for(int i = 0; i < n; i++)
            {
                sum = (k * d[i]) + r[i];
                min = Math.min(sum, min);
            }
            System.out.println(min);
            t--;
        }
    }
}
