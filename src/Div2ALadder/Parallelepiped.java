package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Parallelepiped {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int s1 = fr.nextInt();
        int s2 = fr.nextInt();
        int s3 = fr.nextInt();
        int a = (int) Math.sqrt((1.0 * s1 * s3) / s2);
        int b = (int) Math.sqrt((1.0 * s1 * s2) / s3);
        int c = (int) Math.sqrt((1.0 * s2 * s3) / s1);
        System.out.println(4 * (a + b + c));
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
