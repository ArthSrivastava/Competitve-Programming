package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChungaChanga {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
            long x = fr.nextLong();
            long y = fr.nextLong();
            long z = fr.nextLong();
            long ans1 = (x / z) + (y / z);
            long ans2 = (x + y) / z;
            if (ans1 >= ans2) {
                System.out.println(ans1 + " 0");
            } else {
                long rem1 = x % z;
                long rem2 = y % z;
                long total = rem1 + rem2;
                long exchange = 0;
                if (total >= z) {
                    exchange = z - Math.max(rem1, rem2);
                }
                System.out.println(ans2 + " " + exchange);
            }
    }

    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
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
