package Div2ALadder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lever {

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        String s = fr.nextLine();
        int l = s.length();
        int level = s.indexOf('^');
        long left = 0, right = 0;
        for (int i = 0; i < l; i++) {
            if (i < level && s.charAt(i) != '=') {
                left += (long) (level - i) * (s.charAt(i) - '0');
            }
            if (i > level && s.charAt(i) != '=') {
                right += (long) (i - level) * (s.charAt(i) - '0');
            }
        }
        if (left == right) {
            System.out.println("balance");
        } else if (left > right) {
            System.out.println("left");
        } else {
            System.out.println("right");
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
