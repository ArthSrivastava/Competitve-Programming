package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KDivisibleSum {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            long n = fr.nextLong();
            long k = fr.nextLong();
            long ans = 0;
            if(n > k && n % k == 0) {
                ans = 1;
            } else if(n > k) {
                long num = k * ((n / k) + 1);
                ans = (num / n) + 1;
            } else if (k % n == 0) {
                ans = k / n;
            } else {
                ans = (k / n) + 1;
            }
            System.out.println(ans);
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
