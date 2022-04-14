package Starters34April13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AverageArray {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            long n = fr.nextLong();
            long x = fr.nextLong();
            long sumReqd = n * x;
            long s = ((n * (n + 1)) / 2);
            if (sumReqd > s) {
                for (int i = 1; i < n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println(n + (sumReqd - s));
            } else {
                long l = 1 - (s - sumReqd);
                System.out.print(l + " ");
                for (int i = 2; i <= n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }

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
}
