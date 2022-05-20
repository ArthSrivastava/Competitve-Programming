package Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringLCM {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            String s1 = fr.nextLine();
            String s2 = fr.nextLine();
            int n1 = s1.length();
            int n2 = s2.length();
            int lcm = (n1 * n2) / gcd(n1, n2);
            StringBuilder r1 = new StringBuilder();
            StringBuilder r2 = new StringBuilder();
            for (int i = 0; i < lcm / n1; i++) {
                r1.append(s1);
            }
            for (int i = 0; i < lcm / n2; i++) {
                r2.append(s2);
            }
            if (r1.compareTo(r2) == 0) {
                System.out.println(r1);
            } else {
                System.out.println(-1);
            }
        }
    }

    public static int gcd(int a, int b) {
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
