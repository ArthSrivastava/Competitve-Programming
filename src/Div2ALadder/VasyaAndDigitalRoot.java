package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VasyaAndDigitalRoot {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int k = fr.nextInt();
        int d = fr.nextInt();
        if (d == 0 && k > 1) {
            System.out.println("No solution");
        } else if (d == 0) {
            System.out.println(0);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            for (int i = 0; i < k - 1; i++) {
                sb.append("0");
            }
            System.out.println(sb);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
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
